package com.learn.design.objectpool.jdbc;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.sql.*;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-29 14:50
 * </pre>
 */
public class ConnectionPooledObjectFactory implements PooledObjectFactory<Connection> {
    @Override
    public PooledObject<Connection> makeObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://121.196.165.221:3306/foodie-dev-shop?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&useSSL=false&serverTimezone=GMT",
                "root",
                "R4e3w2q1!123"
        );
        DefaultPooledObject<Connection> connectionDefaultPooledObject = new DefaultPooledObject<>(connection);
        return connectionDefaultPooledObject;
    }

    @Override
    public void destroyObject(PooledObject<Connection> pooledObject) throws Exception {
        Connection connection = pooledObject.getObject();
        connection.close();
    }

    @Override
    public boolean validateObject(PooledObject<Connection> pooledObject) {
        Connection connection = pooledObject.getObject();
        int anInt = 0;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT１");
            ResultSet resultSet = statement.executeQuery();
            anInt = resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1 == anInt;
    }

    @Override
    public void activateObject(PooledObject<Connection> pooledObject) throws Exception {
        // 可以把connection额外的配置放到这里
    }

    @Override
    public void passivateObject(PooledObject<Connection> pooledObject) throws Exception {
        //
    }
}
