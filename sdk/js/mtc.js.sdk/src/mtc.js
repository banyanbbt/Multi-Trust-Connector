/*
* mtc.js.sdk  v1.0.1
*/
(function (win) {

    var auth_url = '';
    var param = {
        agreement_num: '',
        app_key: '',
        device_info: '',
        request_info: {
            'username': '',
            'phone_number': '',
            'agree_status': ''
        },
        type: ''
    };

    function init(url, key, num) {
        auth_url = url;
        param.app_key = key;
        param.agreement_num = num;
        param.type = 'js-sdk';
        param.device_info = device_info();
    }

    function auth(username, phone_number, agree_status) {
        param.request_info.username = username;
        param.request_info.phone_number = phone_number;
        param.request_info.agree_status = agree_status;
        param.request_info = md5(param.request_info);
        param["sign"] = get_sign(param);
        $.ajax({
            url: auth_url,
            dataType: 'json',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(param),
            success: function (data) {
                return data;
            },
            error: function (err) {
                return err;
            }
        });
    }

    function device_info() {
        return navigator.userAgent;
    }

    function get_sign(param) {
        var temp_sign = '';
        for (val in param) {
            temp_sign += $.trim(val) + $.trim(param[val]);
        }
        return md5(temp_sign);
    }

    win.init = init;
    win.auth = auth;
})(window);
