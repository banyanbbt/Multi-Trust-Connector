class UserLoginsController < ApplicationController
  before_action :set_user_login, only: [:show, :edit, :update, :destroy]

  # GET /user_logins
  def index
    @user_logins = UserLogin.all
  end

  # GET /user_logins/1
  def show
  end

  # GET /user_logins/new
  def new
    @user_login = UserLogin.new
  end

  # GET /user_logins/1/edit
  def edit
  end

  # POST /user_logins
  def create
    @user_login = UserLogin.new(user_login_params)

    if @user_login.save
      redirect_to @user_login, notice: 'User login was successfully created.'
    else
      render :new
    end
  end

  # PATCH/PUT /user_logins/1
  def update
    if @user_login.update(user_login_params)
      redirect_to @user_login, notice: 'User login was successfully updated.'
    else
      render :edit
    end
  end

  # DELETE /user_logins/1
  def destroy
    @user_login.destroy
    redirect_to user_logins_url, notice: 'User login was successfully destroyed.'
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_user_login
      @user_login = UserLogin.find(params[:id])
    end

    # Only allow a trusted parameter "white list" through.
    def user_login_params
      params.require(:user_login).permit(:user_id, :remote_ip, :login_on)
    end
end
