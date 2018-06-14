Multi-Trust-Connector Api
---
MTC Api is a java project. It provide api of authorization, verification and so on.

## Requirements
```
JDK8
```

## Install Oracle JDK
#### Install JDK
1. Update:
```
sudo apt-get update
```
2. Install openjdk-8:
```
sudo apt-get install openjdk-8-jdk
```
3. Verify that Java and the Java compiler have been properly installed:
```
java -version
```
this commands should return the following:
```
java version "1.8.0_171"
Java(TM) SE Runtime Environment (build 1.8.0_144-b01)
Java HotSpot(TM) 64-Bit Server VM (build 25.144-b01, mixed mode)
```

#### Set Java Home Environment
1. Set the variable
```
echo "
export JAVA_HOME=$(which java)
export JRE_HOME=\${JAVA_HOME}/jre
export CLASSPATH=.:\${JAVA_HOME}/lib:\${JRE_HOME}/lib
export PATH=\${JAVA_HOME}/bin:\$PATH
" | sudo tee -a /etc/profile
```
2. Reload environment variables
```
source /etc/profile
```
3. Verify the variable was set correctly
```
echo $JAVA_HOME
```

## Apis
### Api Infomation
The api now provided is as follows:
+ get authorization：
Data consumer send required infomation to get authorization

Request parameters

| Parameter | Input requirements | Explanation |
| :------------- | :------------- | :------------- |
| app_key | Must | the key of data consumer |
| agreement_num | Optional | the agreement number used in person and data consumer |
| request_info | Must | the encrypt information |
| type | Must | authorization channel |
| device_info | Must | the device info of person |
| sign | Must | sign string in order to ensure real and non-repudiation of data |

Request example

```json
{
  "app_key":"appkey1234",
  "agreement_num":"143",
  "request_info":"V1Ysx3XZG9Va2LSxr9oDnoc/cEylAHzqNaeA==",
  "type":"sdk",
  "device_info":"",
  "sign":"DD4B2AE71DAECA7A38AE01B4998A0A46"
}
```

Response parameters

| Parameter | Explanation |
| :------------- | :------------- |
| code | return code (see code explanation ) |
| status | return status (see code explanation ) |
| msg | status info (see code explanation ) |
| data |  |
| data.token | authorization token, include in data |

Response example

```json
{
  "code":"200",
  "status":"0000",
  "msg":"请求成功",
  "data":{
    "token":"30271554840284410734062"
  }
}
```

+ verification
Data source verify the correct of single authorization.

Request parameters

| Parameter | Input requirements | Explanation |
| :------------- | :------------- | :------------- |
| fill | Optional | Whether fill with fill_string if can not find token (default false) |
| fill_string | Conditional | if can not find the token return this string, such as NONE |
| key | Must | the key of data source |
| token | Must | the authorization token |

Request example

```json
{
  "key": "asdfasdf123123123",
  "token": "token0128754920asdf673146gfGF00998",
  "fill": false,
  "fill_string": "string"
}
```

Response parameters

| Parameter | Explanation |
| :------------- | :------------- |
| code | return code (see code explanation ) |
| status | return status (see code explanation ) |
| msg | status info (see code explanation ) |
| data |  |
| data.token | authorization token, same as request token|
| data.exist | is any existence in our system |
| data.agreement_id | the agreement number |
| data.request_info | data consumer's authorization infomation |

Response example

```json
{
  "code":"200",
  "status":"2000",
  "msg":"请求成功",
  "data":{
    "token":"token0128754920",
    "exist":true,
    "agreement_id":"agreement134u8123",
    "request_info":"fjkhwjTGYuigh34y6q7ra89fhpEPTRFfq5qrweq"
  }
}
```

+ verifications

Data source verify the correct of authorization list.

Request parameters

| Parameter | Input requirements | Explanation |
| :------------- | :------------- | :------------- |
| fill | Optional | Whether fill with fill_string if can not find token (default false) |
| fill_string | Conditional | if can not find the token return this string, such as NONE |
| key | Must | the key of data source |
| tokens | Must | the authorization token list |

Request example

```json
{
  "key":"appkey1234431123412341234",
  "fill":true,
  "fill_string":"NONE",
  "tokens":[
    "token0128754920",
    "token1287549201",
    "token2234754920"
    ]
}
```

Response parameters

| Parameter | Explanation |
| :------------- | :------------- |
| code | return code (see code explanation ) |
| status | return status (see code explanation ) |
| msg | status info (see code explanation ) |
| data |  |
| data.token | authorization token, same as request token|
| data.exist | is any existence in our system |
| data.agreement_id | the agreement number |
| data.request_info | data consumer's authorization infomation |

Response example

```json
{
    "code":"200",
    "status":"2000",
    "msg":"请求成功",
    "data":[
        {
            "exist":true,
            "token":"token0128754920",
            "agreement_id":"agreement134u8123",
            "request_info":"fjkhwjTGYuigh34y6q7ra89fhpEPTRFfq5qrweq"
        },
        {
            "exist":true,
            "token":"token1287549201",
            "agreement_id ":"fasge324",
            "request_info":"DD4B2AE71DAECA7A38AE01B4998A0A46"
        },
        {
            "exist":false,
            "token":"token2234754920",
            "agreement_id":"NONE",
            "request_info":"NONE"
        }
    ]
}
```

### Code Explanation
| code | status | msg |
| :------------- | :------------- | :------------- |
| 200 | 2000 | 请求成功 |
| 200 | 2001 | 没有查询到结果 |
| 200 | 2002 | 查询失败 |
| 200 | 2003 | 不支持该笔查询 |
| 400 | 9800 | 账户不存在或被禁用 |
| 400 | 9801 | 访问资源不存在 |
| 400 | 9802 | 请求地址没有访问权限 |
| 400 | 9803 | 参数为空或格式错误 |
| 400 | 9804 | 报文解析错误 |
| 400 | 9805 | 验签是被 |
| 500 | 9900 | 系统异常 |
| 500 | 9901 | 服务异常 |
