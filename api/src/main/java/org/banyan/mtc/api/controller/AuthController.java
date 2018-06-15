package org.banyan.mtc.api.controller;

import org.banyan.mtc.api.domain.CustomerDO;
import org.banyan.mtc.api.service.account.AccountValidService;
import org.banyan.mtc.api.service.token.TokenAuthService;
import org.banyan.mtc.api.util.IpUtil;
import org.banyan.mtc.api.util.MD5Util;
import org.banyan.mtc.api.util.Message;
import org.banyan.mtc.api.util.SubmitCode;
import org.banyan.mtc.api.vo.request.AuthorizationVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Authentication Controller
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/26 10:36
 */
@RestController
@RequestMapping("/v1")
@CrossOrigin
public class AuthController {

    private static Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    /**
     * token 授权服务
     */
    @Autowired
    private AccountValidService accountValidService;

    @Autowired
    private TokenAuthService tokenAuthService;

    /**
     * 请求授权API
     *
     * @param authorizationVO 请求授权信息
     * @param request         本次请求上下文
     * @return 授权结果
     */
    @RequestMapping(value = "/authorization", consumes = "application/json")
    public Message authorization(@Valid @RequestBody AuthorizationVO authorizationVO, HttpServletRequest request) {

        Message.Builder builder = new Message.Builder();
        if (!validateSign(authorizationVO)) {
            builder.setCode(SubmitCode.SIGN_FAILED);
            return builder.build();
        }

        CustomerDO customer = this.accountValidService.findCustomerByAppKey(authorizationVO.getAppKey());
        if (null == customer) {
            LOGGER.info("按APPKey验证不合法,key: {}", authorizationVO.getAppKey());
            return builder.setCode(SubmitCode.AUTH_FAILED).build();
        }

        String ip = IpUtil.getIpAddr(request);
        String authorization = this.tokenAuthService.authorization(authorizationVO, customer.getId(), ip);
        if (null != authorization && authorization.length() > 0) {
            Map<String, String> token = new HashMap<>();
            token.put("token", authorization);
            builder.setCode(SubmitCode.SUCCESS).setData(token);
        } else {
            builder.setCode(SubmitCode.SYSTEM_ERROR);
        }
        LOGGER.info(builder.build().toString());
        return builder.build();
    }


    /**
     * 验签
     *
     * @param authorizationVO 输入参数
     * @return 验签结果
     */
    private boolean validateSign(AuthorizationVO authorizationVO) {
        StringBuilder sb = new StringBuilder();
        sb.append("agreement_num").append(authorizationVO.getAgreement()).append("app_key")
                .append(authorizationVO.getAppKey()).append("device_info").append(authorizationVO.getDeviceInfo())
                .append("request_info").append(authorizationVO.getRequestInfo()).append("type")
                .append(authorizationVO.getType());
        return authorizationVO.getSign().equalsIgnoreCase(MD5Util.encrypt(sb.toString()));
    }
}
