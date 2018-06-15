package org.banyan.mtc.api.vo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Verification Result
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/26 12:01
 */
public class VerificationResult {
    private Boolean exist;
    private String token;
    @JsonProperty(value = "agreement_id")
    private String agreementId;
    @JsonProperty(value = "request_info")
    private String requestInfo;

    @Override
    public String toString() {
        return "VerificationResult{" + "exist=" + exist + ", token='" + token + '\'' + ", agreementId='" + agreementId + '\'' + ", requestInfo='" + requestInfo + '\'' + '}';
    }

    public Boolean getExist() {
        return exist;
    }

    public VerificationResult setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }

    public String getToken() {
        return token;
    }

    public VerificationResult setToken(String token) {
        this.token = token;
        return this;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public VerificationResult setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public VerificationResult setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo;
        return this;
    }
}
