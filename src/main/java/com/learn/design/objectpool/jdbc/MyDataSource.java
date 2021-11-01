package com.learn.design.objectpool.jdbc;

import org.apache.commons.pool2.impl.GenericObjectPool;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 9:23
 * </pre>
 */
public class MyDataSource implements DataSource {

    private GenericObjectPool<Connection> pool;

    public MyDataSource() {
        this.pool = new GenericObjectPool<>(new ConnectionPooledObjectFactory());
    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = this.pool.borrowObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("获取连接失败", e);
        }
        return connection;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return this.getConnection();
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        throw new UnsupportedOperationException("不支持该操作");
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        throw new UnsupportedOperationException("不支持该操作");
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        throw new UnsupportedOperationException("不支持该操作");
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        throw new UnsupportedOperationException("不支持该操作");
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        throw new UnsupportedOperationException("不支持该操作");
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        throw new UnsupportedOperationException("不支持该操作");
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public GenericObjectPool<Connection> getPool() {
        return pool;
    }

    public void setPool(GenericObjectPool<Connection> pool) {
        this.pool = pool;
    }
}
