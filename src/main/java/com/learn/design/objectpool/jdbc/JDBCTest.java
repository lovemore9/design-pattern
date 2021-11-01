package com.learn.design.objectpool.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-29 14:37
 * </pre>
 */
@Slf4j
public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://121.196.165.221:3306/foodie-dev-shop?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&useSSL=false&serverTimezone=GMT",
                "root",
                "R4e3w2q1!123"
        );
        PreparedStatement preparedStatement = connection.prepareStatement("select * from orders");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            log.info("id: {}", resultSet.getString("id"));
            log.info("user_id: {}", resultSet.getString("user_id"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
