

// User login Enter
$("#user-login-form #name").bind('keydown', function (e) {
  var key = e.keyCode;
  if(key == 13){
    userLogin();
    return false;
  }
});

// User login
function userLogin() {
  var submitForm = $('#user-login-form');
  var response_data = ajaxPost($(submitForm).attr('action'), $(submitForm).serialize());
  if(response_data){
      window.location.href = response_data['content']['url'];
  }
}

// Ajax post
function ajaxPost(url, params) {
  var response_data = '';
  $.ajax({
    url: url,
    dataType: 'json',
    type: 'POST',
    async: false,
    data: params,
    success: function(data){
      if(data.status=='0000'){
        console.log(data);
        response_data = data;
      }else{
        alert(data.message);
        return false;
      }
    },
    error:function(response){
      var error_message = (response.status == 403) ? response.responseText : "程序处理异常，请稍后重试";
      alert(error_message);
      return false;
    }
  });
  return response_data;
}