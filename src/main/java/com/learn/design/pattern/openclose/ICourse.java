package com.learn.design.pattern.openclose;

/**
 * 课程
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 11:02
 * </pre>
 */
public interface ICourse {

    /**
     * 获取ID
     * @return java.lang.Integer
     * @author YJ WANG
     *  Created on :2021/10/12 11:04
     */
    Integer getId();

    /**
     * 获取名称
     * @param
     * @return java.lang.String
     * @author YJ WANG
     *  Created on :2021/10/12 11:04
     */
    String getName();

    /**
     * 获取分数
     * @param
     * @return java.lang.Double
     * @author YJ WANG
     *  Created on :2021/10/12 11:04
     */
    Double getPrice();
}
