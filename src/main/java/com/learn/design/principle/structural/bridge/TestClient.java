package com.learn.design.principle.structural.bridge;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-19 14:21
 * </pre>
 */
public class TestClient {
    public static void main(String[] args) {
        Bank icbcBanck = new ICBCBanck(new DepositAccount());
        Account icbcAccount = icbcBanck.openAccount();
        icbcAccount.showAccountType();

        Bank abcBanck = new ABCBanck(new SavingAccount());
        Account abcAcchount = abcBanck.openAccount();
        abcAcchount.showAccountType();

    }
}
