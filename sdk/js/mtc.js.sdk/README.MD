MTC-JS-SDK
---

## Description

MTC SDK of JavaScript is convenient for users to request authorization, available for browsers or mobile devices.

## Usage

#### Including files

As shown in the demos, you will need to include:
- [jQuery](https://github.com/jquery/jquery)  (1.6.0 minimum)
- The JavaScript MD5 file: [JavaScript-MD5](https://github.com/blueimp/JavaScript-MD5)
- The JavaScript file: ***mtc.js*** (or its minified version:  ***mtc.min.js***)


#### Initialization

Funtion of ***init()*** need to be introduced with the parameters of MTC-API-URL, Your-APP-Key and Your-Agreement-Number.

```
$(document).ready(function () {
    init('MTC-API-URL', 'Your-APP-Key', 'Your-Agreement-Number');
});
```


#### Request authorization

In order to get authorization, you need to send your user name, contact number, and accepting all terms of the user agreement. And then you can get the token belongs to yourself.

```
$('button').click(function () {
    var user_name = $('#user_name').val();
    var phone_number = $('#phone_number').val();
    var agree_status = $('#agree_status').prop('checked');

    auth(user_name, phone_number, agree_status);
});
```
