Rails.application.routes.draw do
  resources :roles
  resources :user_logins
  resources :users
  resources :messages
  resources :agreement_fillings
  resources :products
  resources :customers
  resources :agreements
  resources :customer_agreements
end
