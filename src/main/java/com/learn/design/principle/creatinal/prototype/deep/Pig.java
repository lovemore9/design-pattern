package com.learn.design.principle.creatinal.prototype.deep;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-14 16:17
 * </pre>
 */
@Data
@ToString
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig clone = (Pig) super.clone();
        clone.birthday = (Date) clone.birthday.clone();
        return clone;
    }
}
