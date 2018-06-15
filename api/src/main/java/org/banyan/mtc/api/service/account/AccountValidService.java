package org.banyan.mtc.api.service.account;

import org.banyan.mtc.api.domain.CustomerDO;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Account Service
 *
 * @author Jimmy
 * @since 0.1.0
 * <p>
 * 2018/4/5 10:21
 */
public interface AccountValidService {
    /**
     * 获取请求授权app信息
     *
     * @param appkey app key
     * @return app key关联的客户信息
     */
    CustomerDO findCustomerByAppKey(String appkey);
}
