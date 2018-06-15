class BaseWrapper

  class << self
    def has_value?(value)
      value && value.present?
    end

    def has_size?(value)
      value && value.size > 0
    end

    def small_image(image_url)
      "#{image_url}!143X252" if image_url.present?
    end

  end

end