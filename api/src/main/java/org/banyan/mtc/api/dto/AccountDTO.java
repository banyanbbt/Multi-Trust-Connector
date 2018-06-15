package org.banyan.mtc.api.dto;

import java.io.Serializable;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Account DTO
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/22 12:32
 */
public class AccountDTO implements Serializable {

    private static final long serialVersionUID = 6020857609309436015L;

    public String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "AccountDTO{" + "account='" + account + '\'' + '}';
    }
}
