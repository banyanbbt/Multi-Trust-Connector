package org.banyan.mtc.api.service.token;

import org.banyan.mtc.api.vo.request.AuthorizationVO;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Token Authentication Service
 *
 * @author Jimmy
 * @since 0.1.0
 * <p>
 * 2018/3/29 13:52
 */
public interface TokenAuthService {

    /**
     * 获取授权码
     *
     * @param authorizationVO 请求参数
     * @param id              客户id
     * @param ip              客户请求ip
     * @return 返回结果
     */
    String authorization(AuthorizationVO authorizationVO, int id, String ip);
}
