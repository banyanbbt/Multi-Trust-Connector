package org.banyan.mtc.api.repository;

import org.banyan.mtc.api.domain.AgreementFillingDO;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Agreement Filling Repository
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/23 10:04
 */
@Repository
public interface AgreementFillingRepository extends PagingAndSortingRepository<AgreementFillingDO, Integer> {

    /**
     * 按token单次查询授权相关信息
     *
     * @param token 授权码
     * @return 返回授权相关信息
     */
    AgreementFillingDO findByAppKeyAndAgreementToken(String token, String appkey);

    /**
     * 批量查询Token
     *
     * @param tokens 授权码列表
     * @return 返回授权相关信息
     */
    List<AgreementFillingDO> findByAppKeyAndAgreementTokenIn(String appkey, Set<String> tokens);

    /**
     * 非授权条件下查询token
     *
     * @param token 授权码
     * @return 返回授权相关信息
     */
    AgreementFillingDO findByAgreementToken(String token);

}
