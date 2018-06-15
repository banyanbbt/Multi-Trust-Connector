class ApplicationController < ActionController::Base
  protect_from_forgery with: :exception
  before_action :set_customer_type

  helper_method :is_data_provider?, :is_developer?

  def set_customer_type
    if session[:customer_type].present?
      @customer_type = session[:customer_type]
    else
      set_data_provider
    end
  end

  def is_data_provider?
    @customer_type == 'data_provider'
  end

  def is_developer?
    @customer_type == 'app_developer'
  end

  def set_data_provider
    session[:customer_type] = 'data_provider'
    @customer_type = 'data_provider'
  end

  def set_developer
    session[:customer_type] = 'app_developer'
    @customer_type = 'app_developer'
  end

  def parse_remote_ip
    request.env['HTTP_X_REAL_IP']
  end

  def render_json(content)
    render json: {status: ErrorCode::SUCCESS, content: content}
  end

  def render_error(error_code)
    code = ErrorCode.error_content(error_code)
    render json: {status: code.first, message: code.last}
  end

end
