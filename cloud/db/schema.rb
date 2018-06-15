# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 20180608030842) do

  create_table "agreement_fillings", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.string "serial_no"
    t.string "agreement_code"
    t.integer "product_id"
    t.string "product_name"
    t.string "product_version"
    t.string "system_version"
    t.string "sdk_version"
    t.date "agreed_on"
    t.text "device_content"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["agreement_code"], name: "index_agreement_fillings_on_agreement_code"
    t.index ["product_id"], name: "index_agreement_fillings_on_product_id"
    t.index ["serial_no"], name: "index_agreement_fillings_on_serial_no", unique: true
  end

  create_table "agreements", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.integer "customer_id"
    t.string "code"
    t.string "name"
    t.string "description"
    t.text "content"
    t.string "level"
    t.string "version"
    t.datetime "effective_date"
    t.datetime "expiration_date"
    t.string "status"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["code"], name: "index_agreements_on_code", unique: true
    t.index ["customer_id"], name: "index_agreements_on_customer_id"
    t.index ["name"], name: "index_agreements_on_name"
    t.index ["status"], name: "index_agreements_on_status"
  end

  create_table "customer_agreements", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.integer "owner_id"
    t.integer "receiver_id"
    t.integer "agreement_id"
    t.string "status"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["agreement_id"], name: "index_customer_agreements_on_agreement_id"
    t.index ["owner_id"], name: "index_customer_agreements_on_owner_id"
    t.index ["receiver_id"], name: "index_customer_agreements_on_receiver_id"
  end

  create_table "customers", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.string "name"
    t.string "avatar"
    t.string "description"
    t.string "website"
    t.string "authentication_token"
    t.string "customer_type"
    t.string "status"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["authentication_token"], name: "index_customers_on_authentication_token", unique: true
    t.index ["customer_type"], name: "index_customers_on_customer_type"
    t.index ["name"], name: "index_customers_on_name"
    t.index ["status"], name: "index_customers_on_status"
  end

  create_table "messages", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.integer "owner_id"
    t.integer "receiver_id"
    t.integer "agreement_id"
    t.string "content"
    t.string "read_status"
    t.string "auth_status"
    t.string "status"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
  end

  create_table "products", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.integer "customer_id"
    t.string "name"
    t.string "avatar"
    t.string "description"
    t.string "website"
    t.string "application_token"
    t.string "version"
    t.string "support_platform"
    t.string "download_link"
    t.string "status"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["customer_id"], name: "index_products_on_customer_id"
    t.index ["name"], name: "index_products_on_name"
  end

  create_table "roles", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.string "name"
    t.string "description"
    t.string "status"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
  end

  create_table "user_logins", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.integer "user_id"
    t.string "remote_ip"
    t.date "login_on"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["login_on"], name: "index_user_logins_on_login_on"
    t.index ["user_id"], name: "index_user_logins_on_user_id"
  end

  create_table "user_roles", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.integer "user_id"
    t.integer "role_id"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["role_id"], name: "index_user_roles_on_role_id"
    t.index ["user_id"], name: "index_user_roles_on_user_id"
  end

  create_table "users", force: :cascade, options: "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" do |t|
    t.string "name"
    t.string "email"
    t.string "avatar"
    t.string "description"
    t.string "password"
    t.string "password_salt"
    t.integer "user_role_id"
    t.string "user_type"
    t.integer "customer_id"
    t.string "status"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
    t.index ["email"], name: "index_users_on_email", unique: true
    t.index ["name"], name: "index_users_on_name", unique: true
    t.index ["user_role_id"], name: "index_users_on_user_role_id"
  end

end
