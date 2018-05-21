class CreateCustomerAgreements < ActiveRecord::Migration[5.1]
  def change
    create_table :customer_agreements do |t|
      t.integer :owner_id
      t.integer :receiver_id
      t.integer :agreement_id
      t.string :read_status
      t.string :auth_status

      t.timestamps
    end

    add_index :customer_agreements, :owner_id
    add_index :customer_agreements, :receiver_id
    add_index :customer_agreements, :agreement_id
  end
end
