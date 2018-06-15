Rails.application.routes.draw do
  root :to => 'home#index'

  resources :home, only: [:index, :create]

  resources :user_roles
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
