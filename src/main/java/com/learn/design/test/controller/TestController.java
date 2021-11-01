package com.learn.design.test.controller;

import com.learn.design.test.entity.Orders;
import com.learn.design.test.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 9:42
 * </pre>
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("dataSource")
    public Object testDataSource() {
        List<Orders> list = ordersService.list();
        return list;
    }
}
