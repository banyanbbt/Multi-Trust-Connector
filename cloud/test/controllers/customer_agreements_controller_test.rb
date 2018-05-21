require 'test_helper'

class CustomerAgreementsControllerTest < ActionDispatch::IntegrationTest
  setup do
    @customer_agreement = customer_agreements(:one)
  end

  test "should get index" do
    get customer_agreements_url
    assert_response :success
  end

  test "should get new" do
    get new_customer_agreement_url
    assert_response :success
  end

  test "should create customer_agreement" do
    assert_difference('CustomerAgreement.count') do
      post customer_agreements_url, params: { customer_agreement: { agreement_id: @customer_agreement.agreement_id, auth_status: @customer_agreement.auth_status, owner_id: @customer_agreement.owner_id, read_status: @customer_agreement.read_status, receiver_id: @customer_agreement.receiver_id } }
    end

    assert_redirected_to customer_agreement_url(CustomerAgreement.last)
  end

  test "should show customer_agreement" do
    get customer_agreement_url(@customer_agreement)
    assert_response :success
  end

  test "should get edit" do
    get edit_customer_agreement_url(@customer_agreement)
    assert_response :success
  end

  test "should update customer_agreement" do
    patch customer_agreement_url(@customer_agreement), params: { customer_agreement: { agreement_id: @customer_agreement.agreement_id, auth_status: @customer_agreement.auth_status, owner_id: @customer_agreement.owner_id, read_status: @customer_agreement.read_status, receiver_id: @customer_agreement.receiver_id } }
    assert_redirected_to customer_agreement_url(@customer_agreement)
  end

  test "should destroy customer_agreement" do
    assert_difference('CustomerAgreement.count', -1) do
      delete customer_agreement_url(@customer_agreement)
    end

    assert_redirected_to customer_agreements_url
  end
end
