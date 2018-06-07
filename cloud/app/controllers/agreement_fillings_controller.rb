class AgreementFillingsController < ApplicationController
  before_action :set_agreement_filling, only: [:show, :edit, :update, :destroy]

  # GET /agreement_fillings
  def index
    @agreement_fillings = AgreementFilling.all
  end

  # GET /agreement_fillings/1
  def show
  end

  # GET /agreement_fillings/new
  def new
    @agreement_filling = AgreementFilling.new
  end

  # GET /agreement_fillings/1/edit
  def edit
  end

  # POST /agreement_fillings
  def create
    @agreement_filling = AgreementFilling.new(agreement_filling_params)

    if @agreement_filling.save
      redirect_to @agreement_filling, notice: 'Agreement filling was successfully created.'
    else
      render :new
    end
  end

  # PATCH/PUT /agreement_fillings/1
  def update
    if @agreement_filling.update(agreement_filling_params)
      redirect_to @agreement_filling, notice: 'Agreement filling was successfully updated.'
    else
      render :edit
    end
  end

  # DELETE /agreement_fillings/1
  def destroy
    @agreement_filling.destroy
    redirect_to agreement_fillings_url, notice: 'Agreement filling was successfully destroyed.'
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_agreement_filling
      @agreement_filling = AgreementFilling.find(params[:id])
    end

    # Only allow a trusted parameter "white list" through.
    def agreement_filling_params
      params.require(:agreement_filling).permit(:serial_no, :agreement_code, :product_id, :product_name, :product_version, :system_version, :sdk_version, :agreed_on, :device_content)
    end
end
