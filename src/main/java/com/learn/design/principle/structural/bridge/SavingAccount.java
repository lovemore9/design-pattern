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
public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        log.info("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        log.info("这是一个活期账号");
    }
}
