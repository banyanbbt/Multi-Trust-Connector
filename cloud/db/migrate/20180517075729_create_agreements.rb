class CreateAgreements < ActiveRecord::Migration[5.1]
  def change
    create_table :agreements do |t|
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
  end
end
