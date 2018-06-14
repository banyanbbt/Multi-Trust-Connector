package org.banyan.mtc.api.domain;

import javax.persistence.*;
import java.util.Date;


/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Account Entity
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/20 10:01
 */
@Entity
@Table(name = "accounts")
public class AccountDO {

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
        return "AccountDO{" + "id=" + id + ", account='" + account + '\'' + ", secret='" + secret + '\'' + ", salt='" + salt + '\'' + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + ", status=" + status + '}';
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
