package com.learn.design.objectpool.commonspool;



import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.math.BigDecimal;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-29 14:20
 * </pre>
 */
@Slf4j
public class MoneyPooledObjectFactory implements PooledObjectFactory<Money> {

    /**
     * @Description PooledObject会对原始类Money进行包装，使其被对象池管理
     */
    @Override
    public PooledObject<Money> makeObject() throws Exception {
        PooledObject<Money> object =  new DefaultPooledObject<>(
                new Money("USD", new BigDecimal("1"))
        );

        log.info("makeObject..state = {}", object.getState());
        return object;
    }

    @Override
    public void destroyObject(PooledObject<Money> pooledObject) throws Exception {
        log.info("makeObject..state = {}", pooledObject.getState());
    }

    @Override
    public boolean validateObject(PooledObject<Money> pooledObject) {
        log.info("makeObject..state = {}", pooledObject.getState());
        return true;
    }

    @Override
    public void activateObject(PooledObject<Money> pooledObject) throws Exception {
        log.info("makeObject..state = {}", pooledObject.getState());
    }

    @Override
    public void passivateObject(PooledObject<Money> pooledObject) throws Exception {
        log.info("makeObject..state = {}", pooledObject.getState());
    }
}
