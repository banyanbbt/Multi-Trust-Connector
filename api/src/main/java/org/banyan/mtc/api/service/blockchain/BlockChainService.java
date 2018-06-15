package org.banyan.mtc.api.service.blockchain;

import org.banyan.blockchain.engine.core.block.Block;
import org.banyan.blockchain.engine.core.transaction.ContractTransaction;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * MTC BlockChain Service 
 *
 * @author Jimmy
 * @since 0.1.0
 * <p>
 * 2018/4/8 10:27
 */
public interface BlockChainService {

    /**
     * 发送交易信息
     *
     * @param contractTransaction 交易相关信息
     * @return 交易hash值
     */
    String sendTransaction(ContractTransaction contractTransaction);

    /**
     * 按照hash值从区块链上获取数据
     *
     * @param hash 交易hash值
     * @return 交易相关信息
     */
    ContractTransaction getTransactionByHash(String hash);

    /**
     * 增加区块
     *
     * @param block 区块相关信息
     * @return 是否添加成功
     */
    boolean addBlock(Block block);

    /**
     * 按照块高度从区块链上获取区块数据
     *
     * @param height 指定高度
     * @return 区块相关信息
     */
    Block getBlockByHeight(String height);

    /**
     * 根据hash值获取区块信息
     *
     * @param hash 区块hash
     * @return 区块信息
     */
    Block getBlockByHash(String hash);

    /**
     * 获取下一个区块
     *
     * @param hash 区块hash值
     * @return 区块相关信息
     */
    Block getNextBlock(String hash);

    /**
     * 返回当前区块hash值
     *
     * @return 当前区块hash
     */
    String currentBlockHash();
}
