class CreateAgreementFillings < ActiveRecord::Migration[5.1]
  def change
    create_table :agreement_fillings do |t|
      t.string :serial_no
      t.string :agreement_code
      t.integer :product_id
      t.string :product_name
      t.string :product_version
      t.string :system_version
      t.string :sdk_version
      t.date :agreed_on
      t.text :device_content

      t.timestamps
    end

    add_index :agreement_fillings, :serial_no, unique: true
    add_index :agreement_fillings, :agreement_code
    add_index :agreement_fillings, :product_id
  end
end
