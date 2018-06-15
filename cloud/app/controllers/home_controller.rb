class HomeController < ApplicationController
  layout false

  def index
  end

  def create
      username = params[:username]
      user = User.fetch_user(username)
      if user.present?
        if user.valid_password?(params[:password])
          user_info = UserWrapper.user_info(user)
          user_info[:url] = '/agreement_fillings'
          # UserWorker.delay.build_user_login(user.id, parse_remote_ip, Time.now)
          render_json(user_info)
        else
          render_error(:user_password_error)
        end
      else
        render_error(:user_not_existed)
      end
  end

end
