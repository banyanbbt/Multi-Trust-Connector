class CreateProducts < ActiveRecord::Migration[5.1]
  def change
    create_table :products do |t|
      t.integer :customer_id
      t.string :name
      t.string :avatar
      t.string :description
      t.string :website
      t.string :application_token
      t.string :version
      t.string :support_platform
      t.string :download_link
      t.string :status

      t.timestamps
    end

    add_index :products, :customer_id
    add_index :products, :name
  end
end
