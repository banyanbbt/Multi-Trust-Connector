class CreateCustomers < ActiveRecord::Migration[5.1]
  def change
    create_table :customers do |t|
      t.string :name
      t.string :avatar
      t.string :description
      t.string :website
      t.string :authentication_token
      t.string :status

      t.timestamps
    end

    add_index :customers, :authentication_token, unique: true
    add_index :customers, :name
    add_index :customers, :customer_type
    add_index :customers, :status
  end
end
