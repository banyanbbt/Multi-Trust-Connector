package org.banyan.mtc.api.service.blockchain.impl.eth;

import org.banyan.mtc.api.service.blockchain.BlockChainService;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC Eth BlockChain Service Implement
 *
 * @author Jimmy
 * @since 0.1.0
 * <p>
 * 2018/4/8 13:59
 */
public class EthBlockChainServiceImpl implements BlockChainService {

    /**
     * 发送交易信息
     *
     * @param contractTransaction 交易相关信息
     * @return 交易hash值
     */
    @Override
    public String sendTransaction(ContractTransaction contractTransaction) {
        return null;
    }

    /**
     * 按照hash值从区块链上获取数据
     *
     * @param hash 交易hash值
     * @return 交易相关信息
     */
    @Override
    public ContractTransaction getTransactionByHash(String hash) {
        return null;
    }

    /**
     * 按照块高度从区块链上获取数据
     *
     * @param hight 指定高度
     * @return 交易相关信息
     */
    @Override
    public ContractTransaction getTransactionBysHight(String hight) {
        return null;
    }

    /**
     * 根据hash值获取区块信息
     *
     * @param hash 区块hash
     * @return 区块信息
     */
    @Override
    public Block getBlockByHash(String hash) {
        return null;
    }

    /**
     * 增加区块
     *
     * @param block 区块相关信息
     * @return 是否添加成功
     */
    @Override
    public boolean addBlock(Block block) {
        return false;
    }

    /**
     * 获取下一个区块
     *
     * @param hash 区块hash值
     * @return 区块相关信息
     */
    @Override
    public Block getNextBlock(String hash) {
        return null;
    }

    /**
     * 返回当前区块hash值
     *
     * @return 当前区块hash
     */
    @Override
    public String currentBlockHash() {
        return null;
    }
}
