package org.banyan.mtc.api.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Customer-Agreement Entity
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/20 12:32
 */
@Entity
@Table(name = "customer_agreement_infos")
public class CustomerAgreementInfoDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 授权协议号
     */
    @Column(name = "agreement_number")
    private String agreementNumber;

    /**
     * 发起方
     */
    @Column(name = "launched_by")
    private String launchedBy;

    /**
     * 接收方
     */
    @Column(name = "received_by")
    private String receivedBy;

    /**
     * 协议状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    /**
     * 修改时间
     */
    @Column(name = "modified_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(String agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public String getLaunchedBy() {
        return launchedBy;
    }

    public void setLaunchedBy(String launchedBy) {
        this.launchedBy = launchedBy;
    }

    public String getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
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

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "CustomerAgreementInfoDO{" + "id=" + id + ", agreementNumber='" + agreementNumber + '\'' + ", launchedBy='" + launchedBy + '\'' + ", receivedBy='" + receivedBy + '\'' + ", status='" + status + '\'' + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + '}';
    }
}
