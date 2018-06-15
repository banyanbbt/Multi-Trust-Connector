package org.banyan.mtc.api.controller;

import org.banyan.mtc.api.domain.CustomerDO;
import org.banyan.mtc.api.service.account.AccountValidService;
import org.banyan.mtc.api.service.token.TokenValidService;
import org.banyan.mtc.api.util.Message;
import org.banyan.mtc.api.util.SubmitCode;
import org.banyan.mtc.api.vo.request.BulkVerificationVO;
import org.banyan.mtc.api.vo.request.SingleVerificationVO;
import org.banyan.mtc.api.vo.response.VerificationResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Verification Controller
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/26 14:05
 */
@RestController
@RequestMapping("/v1")
@CrossOrigin
public class VerifyController {
    private static Logger LOGGER = LoggerFactory.getLogger(VerifyController.class);

    /**
     * token 授权服务
     */
    @Autowired
    private AccountValidService accountValidService;

    /**
     * token 验证服务
     */
    @Autowired
    private TokenValidService tokenVerifyService;

    /**
     * 实时单次验证授权API
     *
     * @param singleVerificationVO 请求主体
     * @return 验证结果
     */
    @RequestMapping(value = "/verification", consumes = "application/json", produces = "application/json")
    public Message verification(@Valid @RequestBody SingleVerificationVO singleVerificationVO) {
        String appkey = singleVerificationVO.getKey();
        CustomerDO customer = this.accountValidService.findCustomerByAppKey(appkey);
        if (null == customer) {
            LOGGER.info("按APPKey验证用户不合法,key: {}", appkey);
            return new Message.Builder().setCode(SubmitCode.AUTH_FAILED).build();
        }
        VerificationResult result = this.tokenVerifyService.findToken(singleVerificationVO);
        LOGGER.info("result: {}", result);
        return new Message.Builder().setCode(SubmitCode.SUCCESS).setData(result).build();
    }

    /**
     * 离线批量验证授权API
     *
     * @param bulkVerificationVO 请求主体
     * @return 验证结果
     */
    @RequestMapping(value = "/verifications", consumes = "application/json", produces = "application/json")
    public Message verifications(@Valid @RequestBody BulkVerificationVO bulkVerificationVO) {
        String appkey = bulkVerificationVO.getKey();
        CustomerDO customer = this.accountValidService.findCustomerByAppKey(appkey);
        if (null == customer) {
            LOGGER.info("按APPKey验证用户不合法,key: {}", appkey);
            return new Message.Builder().setCode(SubmitCode.AUTH_FAILED).build();
        }

        List<String> tokens = bulkVerificationVO.getTokens();
        if (null == tokens || tokens.size() == 0) {
            LOGGER.info("批量查询出错,tokens数组为空或长度为0");
            return new Message.Builder().setCode(SubmitCode.PARAM_ERROR).build();
        }

        List<VerificationResult> results = this.tokenVerifyService.findTokens(bulkVerificationVO);

        return new Message.Builder().setCode(SubmitCode.SUCCESS).setData(results).build();
    }
}
