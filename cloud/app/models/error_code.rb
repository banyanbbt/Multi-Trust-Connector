class ErrorCode

  SUCCESS = '0000'

  CODES = {
    success:                       [SUCCESS, '成功'],

    default_system_error:          ['1001', '参数不完整'],
    invalid_parameters:            ['1002', '系统内部错误'],

    user_token_invalid:            ['1003', '验证信息无效，请重新登录'],
    user_token_expired:            ['1004', '验证信息过期，请重新登录'],

    username_format_invalid:       ['1005', '用户名请使用数字、字母和下划线'],
    username_length_invalid:       ['1006', '用户名请使用2至16个字符'],
    username_is_blank:             ['1007', '用户名不能为空'],

    email_is_blank:                ['1008', '邮箱不能为空'],
    email_is_existed:              ['1009', '邮箱已存在，请更换其他邮箱'],
    email_not_existed:             ['1010', '邮箱不存在，请检查您输入的邮箱'],
    email_captcha_expired:         ['1011', '邮箱验证码已过期'],
    email_captcha_invalid:         ['1012', '邮箱验证码不正确'],
    email_format_invalid:          ['1013', '邮箱格式有误，请输入正确的邮箱'],

    password_length_invalid:       ['1014', '密码请使用6至16个字符'],
    password_format_invalid:       ['1015', '密码请使用数字、字母和下划线'],
    user_password_error:           ['1016', '用户名或密码有误，请重新输入'],
    confirm_password_invalid:      ['1017', '确认密码有误'],
    password_is_blank:             ['1018', '密码不能为空'],
    verify_password_invalid:       ['1019', '密码验证有误'],

    user_not_existed:              ['1020', '用户不存在']
  }

  class << self

    def default_error
      CODES[:default_system_error]
    end

    def error_content(code)
      if CODES.has_key?(code)
        CODES[code]
      else
        default_error
      end
    end

  end
end
