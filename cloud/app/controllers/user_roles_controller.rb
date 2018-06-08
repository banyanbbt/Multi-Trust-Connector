class UserRolesController < ApplicationController
  before_action :set_user_role, only: [:show, :edit, :update, :destroy]

  # GET /user_roles
  def index
    @user_roles = UserRole.all
  end

  # GET /user_roles/1
  def show
  end

  # GET /user_roles/new
  def new
    @user_role = UserRole.new
  end

  # GET /user_roles/1/edit
  def edit
  end

  # POST /user_roles
  def create
    @user_role = UserRole.new(user_role_params)

    if @user_role.save
      redirect_to @user_role, notice: 'User role was successfully created.'
    else
      render :new
    end
  end

  # PATCH/PUT /user_roles/1
  def update
    if @user_role.update(user_role_params)
      redirect_to @user_role, notice: 'User role was successfully updated.'
    else
      render :edit
    end
  end

  # DELETE /user_roles/1
  def destroy
    @user_role.destroy
    redirect_to user_roles_url, notice: 'User role was successfully destroyed.'
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_user_role
      @user_role = UserRole.find(params[:id])
    end

    # Only allow a trusted parameter "white list" through.
    def user_role_params
      params.require(:user_role).permit(:user_id, :role_id)
    end
end
