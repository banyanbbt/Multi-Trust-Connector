package org.banyan.mtc.api.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Token Verification Request Body
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/27 11:01
 */
public class SingleVerificationVO {
    @NotNull
    private String key;

    @Size(min = 12, max = 64, message = "token的位数不正确")
    private String token;

    private Boolean fill;

    @JsonProperty(value = "fill_string")
    private String fillString;

    @Override
    public String toString() {
        return "SingleVerificationVO{" + "key='" + key + '\'' + ", token='" + token + '\'' + ", fill='" + fill + '\'' + ", fillString='" + fillString + '\'' + '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public String getFillString() {
        return fillString;
    }

    public void setFillString(String fillString) {
        this.fillString = fillString;
    }
}
