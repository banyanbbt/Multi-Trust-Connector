package org.banyan.mtc.api.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Agreement Filling Entity
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/20 10:43
 */
@Entity
@Table(name = "agreement_filings")
public class AgreementFillingDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * AppId
     */
    @Column(name = "app_key")
    private String appKey;

    /**
     * 授权协议号
     */
    @Column(name = "agreement_number")
    private String agreementNumber;

    /**
     * 授权信息加密串
     */
    @Column(name = "request_info")
    private String requestInfo;

    /**
     * 请求渠道
     */
    @Column(name = "channel")
    private String channel;

    /**
     * 设备信息
     */
    @Column(name = "dev_info")
    private String devInfo;

    /**
     * 请求IP
     */
    @Column(name = "request_ip")
    private String requestIp;

    /**
     * 授权码
     */
    @Column(name = "agreement_token")
    private String agreementToken;

    /**
     * 状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Override
    public String toString() {
        return "AgreementFillingDO{" + "id=" + id + ", appKey='" + appKey + '\'' + ", agreementNumber='" + agreementNumber + '\'' + ", requestInfo='" + requestInfo + '\'' + ", channel='" + channel + '\'' + ", devInfo='" + devInfo + '\'' + ", requestIp='" + requestIp + '\'' + ", agreementToken='" + agreementToken + '\'' + ", status='" + status + '\'' + ", createdTime=" + createdTime + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(String agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getAgreementToken() {
        return agreementToken;
    }

    public void setAgreementToken(String agreementToken) {
        this.agreementToken = agreementToken;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
