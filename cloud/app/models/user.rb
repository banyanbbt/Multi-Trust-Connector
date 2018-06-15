class User < ApplicationRecord

  def valid_password?(pwd_value)
    pwd_value.present? &&
    self.password == Util::Token.generate_password(pwd_value, self.password_salt)
  end

  def set_password(pwd_value)
    password_salt = Util::Token.friendly_token
    self.password_salt = password_salt
    self.password = Util::Token.generate_password(pwd_value, password_salt)
  end

  class << self

    def fetch_by_email(email)
      where(email: email).first
    end

    def fetch_by_name(name)
      where(name: name).first
    end

    def fetch_user(identity)
      fetch_by_email(identity) || fetch_by_name(identity)
    end

    def reset_password(captcha, password)
      user = fetch_by_email(captcha.email)
      User.transaction do
        user.set_password(password)
        user.save
        captcha.destroy
      end
      user
    end

    def change_password(email, password)
      user = fetch_by_email(email)
      user.set_password(password)
      user.save
    end

    def email_register(captcha, password, name)
      user = User.new
      User.transaction do
        user.email = captcha.email
        user.name = name
        user.set_password(password)
        user.save
        captcha.destroy

        # Notification.build_welcome_email_notice(user.id)
      end
      user
    end

  end

end
