require 'test_helper'

class AgreementFillingsControllerTest < ActionDispatch::IntegrationTest
  setup do
    @agreement_filling = agreement_fillings(:one)
  end

  test "should get index" do
    get agreement_fillings_url
    assert_response :success
  end

  test "should get new" do
    get new_agreement_filling_url
    assert_response :success
  end

  test "should create agreement_filling" do
    assert_difference('AgreementFilling.count') do
      post agreement_fillings_url, params: { agreement_filling: { agreed_on: @agreement_filling.agreed_on, agreement_code: @agreement_filling.agreement_code, device_content: @agreement_filling.device_content, product_id: @agreement_filling.product_id, product_name: @agreement_filling.product_name, product_version: @agreement_filling.product_version, sdk_version: @agreement_filling.sdk_version, serial_no: @agreement_filling.serial_no, system_version: @agreement_filling.system_version } }
    end

    assert_redirected_to agreement_filling_url(AgreementFilling.last)
  end

  test "should show agreement_filling" do
    get agreement_filling_url(@agreement_filling)
    assert_response :success
  end

  test "should get edit" do
    get edit_agreement_filling_url(@agreement_filling)
    assert_response :success
  end

  test "should update agreement_filling" do
    patch agreement_filling_url(@agreement_filling), params: { agreement_filling: { agreed_on: @agreement_filling.agreed_on, agreement_code: @agreement_filling.agreement_code, device_content: @agreement_filling.device_content, product_id: @agreement_filling.product_id, product_name: @agreement_filling.product_name, product_version: @agreement_filling.product_version, sdk_version: @agreement_filling.sdk_version, serial_no: @agreement_filling.serial_no, system_version: @agreement_filling.system_version } }
    assert_redirected_to agreement_filling_url(@agreement_filling)
  end

  test "should destroy agreement_filling" do
    assert_difference('AgreementFilling.count', -1) do
      delete agreement_filling_url(@agreement_filling)
    end

    assert_redirected_to agreement_fillings_url
  end
end
