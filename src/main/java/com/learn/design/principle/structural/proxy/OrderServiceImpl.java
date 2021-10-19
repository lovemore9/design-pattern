package com.learn.design.principle.structural.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@Component
public class OrderServiceImpl implements IOrderService {

    private IOrderDao orderDao = new OrderDaoImpl();


    @Override
    public int saveOrder(Object order) {
        log.info("service层调用Dao添加Order");
        int insert = orderDao.insert(order);
        return insert;
    }
}
