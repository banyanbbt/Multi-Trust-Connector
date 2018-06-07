Rails.application.routes.draw do
  resources :agreement_fillings
  resources :products
  resources :customers
  resources :agreements
  resources :customer_agreements
end
