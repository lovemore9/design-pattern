package com.learn.design.objectpool.commonspool;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-29 14:17
 * </pre>
 */
@Data
public class Money {

    private String type;

    private BigDecimal price;

    public Money(String type, BigDecimal price) throws InterruptedException {
        this.type = type;
        this.price = price;
        Thread.sleep(10000);
    }
}
