require 'test_helper'

class UserLoginsControllerTest < ActionDispatch::IntegrationTest
  setup do
    @user_login = user_logins(:one)
  end

  test "should get index" do
    get user_logins_url
    assert_response :success
  end

  test "should get new" do
    get new_user_login_url
    assert_response :success
  end

  test "should create user_login" do
    assert_difference('UserLogin.count') do
      post user_logins_url, params: { user_login: { login_on: @user_login.login_on, remote_ip: @user_login.remote_ip, user_id: @user_login.user_id } }
    end

    assert_redirected_to user_login_url(UserLogin.last)
  end

  test "should show user_login" do
    get user_login_url(@user_login)
    assert_response :success
  end

  test "should get edit" do
    get edit_user_login_url(@user_login)
    assert_response :success
  end

  test "should update user_login" do
    patch user_login_url(@user_login), params: { user_login: { login_on: @user_login.login_on, remote_ip: @user_login.remote_ip, user_id: @user_login.user_id } }
    assert_redirected_to user_login_url(@user_login)
  end

  test "should destroy user_login" do
    assert_difference('UserLogin.count', -1) do
      delete user_login_url(@user_login)
    end

    assert_redirected_to user_logins_url
  end
end
