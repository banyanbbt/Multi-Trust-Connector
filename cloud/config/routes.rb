Rails.application.routes.draw do
  resources :products
  resources :customers
  resources :agreements
  resources :customer_agreements
end
