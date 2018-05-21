Rails.application.routes.draw do
  resources :customers
  resources :agreements
  resources :customer_agreements
end
