package org.banyan.mtc.api.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Customer Entity
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/20 12:32
 */
@Entity
@Table(name = "customers")
public class CustomerDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    // 账号
    @Column(name = "account")
    private String account;

    // 密码
    @Column(name = "secret")
    private String secret;

    // 盐值
    @Column(name = "salt")
    private String salt;

    // 用户调用key
    @Column(name = "app_key")
    private String appKey;

    // 客户类型
    @Column(name = "customer_type")
    private String customerType;

    // 客户公司名
    @Column(name = "company")
    private String company;

    // 联系人姓名
    @Column(name = "name")
    private String name;

    // 邮件
    @Column(name = "email")
    private String email;

    // 默认手机号
    @Column(name = "mobile")
    private String mobile;

    // 创建时间
    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    // 修改时间
    @Column(name = "modified_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTime;

    //状态
    @Column(name = "status")
    private String status;

    @Override
    public String toString() {
        return "CustomerDO{" + "id=" + id + ", account='" + account + '\'' + ", secret='" + secret + '\'' + ", salt='" + salt + '\'' + ", appKey='" + appKey + '\'' + ", customerType='" + customerType + '\'' + ", company='" + company + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", mobile='" + mobile + '\'' + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + ", status=" + status + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
