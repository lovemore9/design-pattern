package com.learn.design.principle.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-19 13:59
 * </pre>
 */
@Slf4j
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        log.info("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        log.info("这是一个定期账号");

    }
}
