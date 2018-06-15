package org.banyan.mtc.api.repository;

import org.banyan.mtc.api.domain.CustomerDO;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Customer Repository
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/23 10:04
 */
@Repository
public interface CustomerRepository extends PagingAndSortingRepository<CustomerDO, Integer> {

    /**
     * 获取客户信息
     *
     * @param appkey 客户appkey
     * @return 客户信息
     */
    CustomerDO findByAppKey(String appkey);
}
