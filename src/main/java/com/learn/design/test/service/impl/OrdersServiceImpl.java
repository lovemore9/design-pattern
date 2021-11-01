package com.learn.design.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.design.test.entity.Orders;
import com.learn.design.test.mapper.OrdersMapper;
import com.learn.design.test.service.OrdersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 健康管理师信息表 服务实现类
 * </p>
 *
 * @author Adolf
 * @since 2021-04-14
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}