package com.taobao.yugong;

import com.taobao.yugong.common.model.DataSourceConfig;
import com.taobao.yugong.common.model.DbType;

/**
 * @author agapple 2014年2月25日 下午11:38:06
 * @since 1.0.0
 */
public class BaseDbTest {

    public DataSourceConfig getOracleConfig() {
        DataSourceConfig config = new DataSourceConfig();
        config.setUsername("sgeb");
        config.setPassword("sgeb");
        config.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:orcl");
        config.setEncode("ZHS16GBK");
        config.setType(DbType.ORACLE);

        return config;
    }

    public DataSourceConfig getMysqlConfig() {
        DataSourceConfig config = new DataSourceConfig();
        config.setUsername("sgeb");
        config.setPassword("sgeb");
        config.setUrl("jdbc:mysql://127.0.0.1:3306/sgeb");
        config.setEncode("UTF-8");
        config.setType(DbType.MYSQL);

        return config;
    }
}
