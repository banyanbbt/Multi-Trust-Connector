package org.banyan.mtc.api.service.token.impl;

import org.banyan.mtc.api.domain.AgreementFillingDO;
import org.banyan.mtc.api.repository.AgreementFillingRepository;
import org.banyan.mtc.api.service.token.TokenValidService;
import org.banyan.mtc.api.vo.request.BulkVerificationVO;
import org.banyan.mtc.api.vo.request.SingleVerificationVO;
import org.banyan.mtc.api.vo.response.VerificationResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Token Verification Service Implement
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/30 14:58
 */
@Service
public class TokenVerifyServiceImpl implements TokenValidService {

    private static Logger LOGGER = LoggerFactory.getLogger(TokenVerifyServiceImpl.class);

    @Autowired
    private AgreementFillingRepository agreementFillingRepository;

    @Override
    public VerificationResult findToken(SingleVerificationVO singleVerificationVO) {

        String token = singleVerificationVO.getToken();
        String appkey = singleVerificationVO.getKey();
        String fillString = singleVerificationVO.getFillString();

        AgreementFillingDO afDO = this.agreementFillingRepository.findByAppKeyAndAgreementToken(appkey, token);

        VerificationResult result = new VerificationResult().setToken(token);

        if (null == afDO) {
            result.setExist(false);
            // 判断是否需要填充空值
            if (singleVerificationVO.getFill()) {
                return result.setRequestInfo(fillString).setAgreementId(fillString);
            }
            return result;
        }
        return result.setExist(true).setAgreementId(afDO.getAgreementNumber()).setRequestInfo(afDO.getRequestInfo());
    }

    @Override
    public List<VerificationResult> findTokens(BulkVerificationVO bulkVerificationVO) {
        Set<String> tokens = new HashSet<>(bulkVerificationVO.getTokens());
        String appkey = bulkVerificationVO.getKey();
        Boolean fill = bulkVerificationVO.getFill();
        String fillString = bulkVerificationVO.getFillString();

        List<AgreementFillingDO> agreementTokens = this.agreementFillingRepository
                .findByAppKeyAndAgreementTokenIn(appkey, tokens);

        final List<VerificationResult> results = new ArrayList<>();

        agreementTokens.forEach(p -> {
            tokens.remove(p.getAgreementToken());
            results.add(new VerificationResult().setExist(true).setAgreementId(p.getAgreementNumber())
                    .setRequestInfo(p.getRequestInfo()).setToken(p.getAgreementToken()));
        });

        // 如需填充空字段
        if (fill) {
            tokens.forEach(p -> results
                    .add(new VerificationResult().setToken(p).setExist(false).setAgreementId(fillString)
                            .setRequestInfo(fillString)));
        }
        return results;
    }

    @Override
    public VerificationResult findTokenWithoutAuth(SingleVerificationVO svVO) {
        String token = svVO.getToken();
        String fillString = svVO.getFillString();

        VerificationResult result = new VerificationResult().setToken(token);
        AgreementFillingDO afDO = agreementFillingRepository.findByAgreementToken(token);
        if (afDO == null) {
            result.setExist(false);
            if (svVO.getFill()) {
                return result.setRequestInfo(fillString).setAgreementId(fillString);
            }
            return result;
        }
        return result.setExist(true).setAgreementId(afDO.getAgreementNumber()).setRequestInfo(afDO.getRequestInfo());
    }

}
