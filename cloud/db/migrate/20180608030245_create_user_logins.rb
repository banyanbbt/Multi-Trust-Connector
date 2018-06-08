class CreateUserLogins < ActiveRecord::Migration[5.1]
  def change
    create_table :user_logins do |t|
      t.integer :user_id
      t.string :remote_ip
      t.date :login_on

      t.timestamps
    end

    add_index :user_logins, :user_id
    add_index :user_logins, :login_on
  end
end
