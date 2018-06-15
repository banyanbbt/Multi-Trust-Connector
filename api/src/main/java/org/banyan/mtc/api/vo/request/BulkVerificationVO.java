package org.banyan.mtc.api.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Batch Token Verification Request Body
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/27 11:23
 */
public class BulkVerificationVO {
    @NotNull
    private String key;

    private Boolean fill;

    @JsonProperty(value = "fill_string")
    private String fillString;

    private List<String> tokens;

    @Override
    public String toString() {
        return "BulkVerificationVO{" + "key='" + key + '\'' + ", fill=" + fill + ", fillString='" + fillString + '\'' + ", tokens=" + tokens + '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }
}
