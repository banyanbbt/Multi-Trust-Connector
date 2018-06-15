module Util
  class Token

    class << self

      def friendly_token(length=16)
        SecureRandom.base64(length).tr('+/=lIO0', 'xmhesch')
      end

      def generate_password(password, salt)
        pwd_str = password + "mtc" + salt
        Digest::MD5.hexdigest(pwd_str)
      end

      def numeric_code(length=6)
        chars = '012356789'
        str = ''
        length.times { str << chars[rand(chars.size)] }
        str
      end

      def random_char(length=4)
        chars = 'abcdefghjkmnpqrstuvwxyz'
        str = ''
        length.times { str << chars[rand(chars.size)] }
        str
      end

      def random_name
        "#{random_char}#{numeric_code}"
      end

    end

  end
end