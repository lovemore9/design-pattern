package com.learn.design.objectpool.commonspool;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.impl.GenericObjectPool;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-29 14:18
 * </pre>
 */
@Slf4j
public class CommonsPoolsTest {
    public static void main(String[] args) throws Exception {
        GenericObjectPool<Money> pool = new GenericObjectPool<>(new MoneyPooledObjectFactory());
        Money money = pool.borrowObject();
        log.info(money.toString());
        money.setType("RMB");
        pool.returnObject(money);
        money = pool.borrowObject();
        log.info(money.toString());
    }
}
