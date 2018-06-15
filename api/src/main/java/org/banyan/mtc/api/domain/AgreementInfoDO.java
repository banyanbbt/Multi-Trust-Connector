package org.banyan.mtc.api.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Agreement Info Entity
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/20 12:32
 */
@Entity
@Table(name = "agreement_info")
public class AgreementInfoDO {

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
     * 授权协议名
     */
    @Column(name = "name")
    private String name;

    /**
     * 协议内容
     */
    @Column(name = "content")
    private String content;

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

    /**
     * 修改时间
     */
    @Column(name = "modified_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTime;

    @Override
    public String toString() {
        return "AgreementInfoDO{" + "id=" + id + ", agreementNumber='" + agreementNumber + '\'' + ", name='" + name + '\'' + ", content='" + content + '\'' + ", status='" + status + '\'' + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + '}';
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}
