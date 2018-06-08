class CreateUserRoles < ActiveRecord::Migration[5.1]
  def change
    create_table :user_roles do |t|
      t.integer :user_id
      t.integer :role_id

      t.timestamps
    end

    add_index :user_roles, :user_id
    add_index :user_roles, :role_id
  end
end
