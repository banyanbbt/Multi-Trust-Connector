package org.banyan.mtc.api.service.account.impl;

import org.banyan.mtc.api.domain.CustomerDO;
import org.banyan.mtc.api.repository.CustomerRepository;
import org.banyan.mtc.api.service.account.AccountValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Account Service Implement
 *
 * @author Jimmy
 * @since 0.1.0
 * <p>
 * 2018/4/5 10:45
 */
@Service
public class AccountValidServiceImpl implements AccountValidService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDO findCustomerByAppKey(String appkey) {
        return this.customerRepository.findByAppKey(appkey);
    }
}
