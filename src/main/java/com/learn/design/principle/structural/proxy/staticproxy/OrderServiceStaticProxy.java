package com.learn.design.principle.structural.proxy.staticproxy;

import com.learn.design.principle.structural.proxy.IOrderService;
import com.learn.design.principle.structural.proxy.Order;
import com.learn.design.principle.structural.proxy.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-19 15:09
 * </pre>
 */
@Slf4j
public class OrderServiceStaticProxy {

    private IOrderService orderService = new OrderServiceImpl();

    public int saveOrder(Order order) {
        before();
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        log.info("静态代理分配到【DB{}】处理数据",dbRouter);
        after();
        return orderService.saveOrder(order);
    }

    private void before() {
        log.info("静态代理before");
    }
    private void after() {
        log.info("静态代理after");
    }
}
