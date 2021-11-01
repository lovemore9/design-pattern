package com.learn.design.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.design.test.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 9:38
 * </pre>
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
