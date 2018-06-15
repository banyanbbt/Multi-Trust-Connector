class UserWrapper < BaseWrapper

  class << self

    def user_info(user)
      ret = { user_id: user.id,
        name: user.name,
        avatar: small_image(user.avatar),
        user_type: user.user_type,
        status: user.status
      }

      # user_role = user.role
      # if user_role
      #   ret[:role_name] = user_role.name
      # end

      # if user.customer_id.present?
      #   customer = Customer.where(id: user.customer_id).first
      #   if customer.present?
      #     ret[:customer_type] = customer.customer_type
      #     ret[:customer_name] = customer.name
      #   end
      # end

      ret
    end

  end

end
