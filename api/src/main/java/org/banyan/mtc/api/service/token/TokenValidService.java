package org.banyan.mtc.api.service.token;

import org.banyan.mtc.api.vo.request.BulkVerificationVO;
import org.banyan.mtc.api.vo.request.SingleVerificationVO;
import org.banyan.mtc.api.vo.response.VerificationResult;

import java.util.List;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Token Verification Service
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/30 14:45
 */
public interface TokenValidService {

    /**
     * 单次获取授权信息
     *
     * @param singleVerificationVO 请求主体
     * @return 验证结果
     */
    VerificationResult findToken(SingleVerificationVO singleVerificationVO);

    /**
     * 批量获取授权信息
     *
     * @param bulkVerificationVO
     * @return 验证结果
     */
    List<VerificationResult> findTokens(BulkVerificationVO bulkVerificationVO);

    /**
     * 免认证查验授权信息
     *
     * @param singleVerificationVO 请求主体
     * @return 验证结果
     */
    VerificationResult findTokenWithoutAuth(SingleVerificationVO singleVerificationVO);

}
