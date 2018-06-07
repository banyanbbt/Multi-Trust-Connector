class CreateMessages < ActiveRecord::Migration[5.1]
  def change
    create_table :messages do |t|
      t.integer :owner_id
      t.integer :receiver_id
      t.integer :agreement_id
      t.string :content
      t.string :read_status
      t.string :auth_status
      t.string :status

      t.timestamps
    end
  end
end
