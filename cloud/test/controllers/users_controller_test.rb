require 'test_helper'

class UsersControllerTest < ActionDispatch::IntegrationTest
  setup do
    @user = users(:one)
  end

  test "should get index" do
    get users_url
    assert_response :success
  end

  test "should get new" do
    get new_user_url
    assert_response :success
  end

  test "should create user" do
    assert_difference('User.count') do
      post users_url, params: { user: { avatar: @user.avatar, customer_id: @user.customer_id, description: @user.description, email: @user.email, name: @user.name, password: @user.password, password_salt: @user.password_salt, status: @user.status, user_role_id: @user.user_role_id, user_type: @user.user_type } }
    end

    assert_redirected_to user_url(User.last)
  end

  test "should show user" do
    get user_url(@user)
    assert_response :success
  end

  test "should get edit" do
    get edit_user_url(@user)
    assert_response :success
  end

  test "should update user" do
    patch user_url(@user), params: { user: { avatar: @user.avatar, customer_id: @user.customer_id, description: @user.description, email: @user.email, name: @user.name, password: @user.password, password_salt: @user.password_salt, status: @user.status, user_role_id: @user.user_role_id, user_type: @user.user_type } }
    assert_redirected_to user_url(@user)
  end

  test "should destroy user" do
    assert_difference('User.count', -1) do
      delete user_url(@user)
    end

    assert_redirected_to users_url
  end
end
