package com.learn.design.principle.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-19 14:16
 * </pre>
 */
@Slf4j
public class ABCBanck extends Bank {

    public ABCBanck(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        log.info("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
