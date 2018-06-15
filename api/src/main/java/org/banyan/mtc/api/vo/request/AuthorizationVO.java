package org.banyan.mtc.api.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * /**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Authentication Request Body
 *
 * @author Jimmy
 * @since 0.1.0
 * <p>
 * 2018/3/26 10:14
 */
public class AuthorizationVO {
    @NotNull
    @JsonProperty("app_key")
    private String appKey;

    @NotNull
    @JsonProperty("request_info")
    private String requestInfo;

    @NotNull
    private String type;

    @NotNull
    @JsonProperty("device_info")
    private String deviceInfo;

    @NotNull
    @JsonProperty("agreement_num")
    private String agreement;

    @NotNull
    private String sign;

    @Override
    public String toString() {
        return "AuthorizationVO{" + "appKey='" + appKey + '\'' + ", requestInfo='" + requestInfo + '\'' + ", type='" + type + '\'' + ", deviceInfo='" + deviceInfo + '\'' + ", agreement='" + agreement + '\'' + ", sign='" + sign + '\'' + '}';
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }
}
