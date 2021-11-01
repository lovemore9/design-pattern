package com.learn.design.objectpool.jdbc;

import com.google.common.collect.Maps;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 9:53
 * </pre>
 */
@Endpoint(id = "datasource")
public class DataSourceEndpoint {

    private MyDataSource dataSource;

    public DataSourceEndpoint(MyDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @ReadOperation
    public Map<String, Object> pool() {
        GenericObjectPool<Connection> pool = dataSource.getPool();
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("numActive", pool.getNumActive());
        map.put("numIdle", pool.getNumIdle());
        map.put("createdCount", pool.getCreatedCount());
        return map;
    }
}
