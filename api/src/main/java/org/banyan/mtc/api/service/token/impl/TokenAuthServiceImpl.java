package org.banyan.mtc.api.service.token.impl;

import org.banyan.mtc.api.domain.AgreementFillingDO;
import org.banyan.mtc.api.repository.AgreementFillingRepository;
import org.banyan.mtc.api.service.token.TokenAuthService;
import org.banyan.mtc.api.vo.request.AuthorizationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Token Authentication Service Implement
 *
 * @author Jimmy
 * @since 0.1.0
 * <p>
 * 2018/3/29 13:59
 */
@Service
public class TokenAuthServiceImpl implements TokenAuthService {

    @Autowired
    private AgreementFillingRepository agreementFillingRepository;

    /**
     * 获取授权码
     *
     * @param authorizationVO 请求参数
     * @param id              客户id
     * @param ip              客户请求ip
     * @return 授权结果
     */
    @Override
    public String authorization(AuthorizationVO authorizationVO, int id, String ip) {

        String token = getToken(id);

        AgreementFillingDO agreementFillingDO = new AgreementFillingDO();
        agreementFillingDO.setAppKey(authorizationVO.getAppKey());
        agreementFillingDO.setDevInfo(authorizationVO.getDeviceInfo());
        agreementFillingDO.setAgreementNumber(authorizationVO.getAgreement());
        agreementFillingDO.setAgreementToken(token);
        agreementFillingDO.setChannel(authorizationVO.getType());
        agreementFillingDO.setCreatedTime(new Date());
        agreementFillingDO.setRequestInfo(authorizationVO.getRequestInfo());
        agreementFillingDO.setRequestIp(ip);

        this.agreementFillingRepository.save(agreementFillingDO);
        return token;
    }

    /**
     * 生成token
     *
     * @param id 客户id
     * @return token
     */
    private String getToken(int id) {
        StringBuffer token = new StringBuffer();
        token.append(System.currentTimeMillis() << 1);
        token.append(new Random().nextInt(Integer.MAX_VALUE));
        token.append(id << 1);
        return String.valueOf(token);
    }
}
