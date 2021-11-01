package com.learn.design.objectpool.jdbc;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 *     //1. 回收statement
 *     //2. 回收resultset
 *     //2. 复用connection
 */
public class MyJDBC implements Connection {
    private Connection connection;
    private Statement statement;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public Statement createStatement() throws SQLException {
        Statement statement = this.connection.createStatement();
        this.statement = statement;
        return statement;
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return this.connection.prepareStatement(sql);
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        return this.connection.prepareCall(sql);
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        return this.connection.nativeSQL(sql);

    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {
        this.connection.setAutoCommit(autoCommit);
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return this.connection.getAutoCommit();
    }

    @Override
    public void commit() throws SQLException {
        this.connection.commit();
    }

    @Override
    public void rollback() throws SQLException {
        this.connection.rollback();

    }

    @Override
    public void close() throws SQLException {
        this.connection.close();

    }

    @Override
    public boolean isClosed() throws SQLException {
        return this.connection.isClosed();
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return this.connection.getMetaData();
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        this.connection.setReadOnly(readOnly);
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return this.connection.isReadOnly();
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {
        this.connection.setCatalog(catalog);
    }

    @Override
    public String getCatalog() throws SQLException {
        return this.connection.getCatalog();
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        this.connection.setTransactionIsolation(level);
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return this.connection.getTransactionIsolation();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return this.connection.getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        this.connection.clearWarnings();
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        Statement statement = this.connection.createStatement(resultSetType, resultSetConcurrency);
        this.statement = statement;
        return statement;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return this.connection.prepareStatement(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return this.connection.prepareCall(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return this.connection.getTypeMap();
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        this.connection.setTypeMap(map);
    }

    @Override
    public void setHoldability(int holdability) throws SQLException {
        this.connection.setHoldability(holdability);
    }

    @Override
    public int getHoldability() throws SQLException {
        return this.connection.getHoldability();
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return this.connection.setSavepoint();
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        return this.connection.setSavepoint(name);
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        this.connection.rollback(savepoint);
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        this.connection.releaseSavepoint(savepoint);
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        Statement statement = this.connection.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
        this.statement = statement;
        return statement;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return this.connection.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return this.connection.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return null;
    }

    @Override
    public Clob createClob() throws SQLException {
        return null;
    }

    @Override
    public Blob createBlob() throws SQLException {
        return null;
    }

    @Override
    public NClob createNClob() throws SQLException {
        return null;
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        return null;
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        return false;
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {

    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {

    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        return null;
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        return null;
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return null;
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return null;
    }

    @Override
    public void setSchema(String schema) throws SQLException {

    }

    @Override
    public String getSchema() throws SQLException {
        return null;
    }

    @Override
    public void abort(Executor executor) throws SQLException {

    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {

    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return 0;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }


}
