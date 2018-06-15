package org.banyan.mtc.api.util;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Common Response Code
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/26 19:54
 */
public enum SubmitCode {
    // 查询类
    // code 200
    SUCCESS("200", "2000", "请求成功"),
    QUERY_NO_DATA("200", "2001", "没有查询到结果"),
    QUERY_FAILED("200", "2002", "查询失败"),
    QUERY_UNSUPPORT("200", "2003", "不支持该笔查询"),

    // 通用类
    // code 400
    AUTH_FAILED("400", "9800", "账户不存在或被禁用"),
    PATH_FAILED("400", "9801", "访问资源不存在"),
    IP_FAILED("400", "9802", "请求地址没有访问权限"),
    PARAM_ERROR("400", "9803", "参数为空或格式错误"),
    DATA_FAILED("400", "9804", "报文解析错误"),
    SIGN_FAILED("400", "9805", "验签失败"),
    TIME_INTERVAL_ERROR("400", "9806", "查询时间区间不正确"),
    ACCESS_FAILED("400", "9807", "用户没有权限"),
    VERIFY_FAILED("400", "9808", "Token验证失败"),

    // CODE 500
    SYSTEM_ERROR("500", "9900", "系统异常"),
    SERVICE_ERROR("500", "9901", "服务异常");

    private String code;
    private String status;
    private String msg;

    SubmitCode(String code, String status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
