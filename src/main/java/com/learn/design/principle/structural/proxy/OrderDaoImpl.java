package com.learn.design.principle.structural.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-19 15:05
 * </pre>
 */
@Slf4j
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Object order) {
        log.info("Dao层添加Order成功");
        return 1;
    }
}
