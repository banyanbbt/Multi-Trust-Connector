class CreateAgreements < ActiveRecord::Migration[5.1]
  def change
    create_table :agreements do |t|
      t.integer :customer_id
      t.string :code
      t.string :name
      t.string :description
      t.text :content
      t.string :level
      t.string :version
      t.datetime :effective_date
      t.datetime :expiration_date
      t.string :status

      t.timestamps
    end

    add_index :agreements, :code, unique: true
    add_index :agreements, :customer_id
    add_index :agreements, :name
    add_index :agreements, :status
  end
end
