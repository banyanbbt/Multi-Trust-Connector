class CreateUsers < ActiveRecord::Migration[5.1]
  def change
    create_table :users do |t|
      t.string :name
      t.string :email
      t.string :avatar
      t.string :description
      t.string :password
      t.string :password_salt
      t.integer :user_role_id
      t.string :user_type
      t.integer :customer_id
      t.string :status

      t.timestamps
    end

    add_index :users, :name, unique: true
    add_index :users, :email, unique: true
    add_index :users, :user_role_id
  end
end
