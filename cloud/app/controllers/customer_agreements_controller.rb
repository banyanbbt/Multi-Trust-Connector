class CustomerAgreementsController < ApplicationController
  before_action :set_customer_agreement, only: [:show, :edit, :update, :destroy]

  # GET /customer_agreements
  def index
    @customer_agreements = CustomerAgreement.all
  end

  # GET /customer_agreements/1
  def show
  end

  # GET /customer_agreements/new
  def new
    @customer_agreement = CustomerAgreement.new
  end

  # GET /customer_agreements/1/edit
  def edit
  end

  # POST /customer_agreements
  def create
    @customer_agreement = CustomerAgreement.new(customer_agreement_params)

    if @customer_agreement.save
      redirect_to @customer_agreement, notice: 'Customer agreement was successfully created.'
    else
      render :new
    end
  end

  # PATCH/PUT /customer_agreements/1
  def update
    if @customer_agreement.update(customer_agreement_params)
      redirect_to @customer_agreement, notice: 'Customer agreement was successfully updated.'
    else
      render :edit
    end
  end

  # DELETE /customer_agreements/1
  def destroy
    @customer_agreement.destroy
    redirect_to customer_agreements_url, notice: 'Customer agreement was successfully destroyed.'
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_customer_agreement
      @customer_agreement = CustomerAgreement.find(params[:id])
    end

    # Only allow a trusted parameter "white list" through.
    def customer_agreement_params
      params.require(:customer_agreement).permit(:owner_id, :receiver_id, :agreement_id, :read_status, :auth_status)
    end
end
