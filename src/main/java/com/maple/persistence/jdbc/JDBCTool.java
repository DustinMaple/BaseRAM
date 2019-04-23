package com.maple.persistence.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JDBCTool {
    private static final Logger logger = LogManager.getLogger();

    public static final JDBCTool INSTANCE = new JDBCTool();
    private Properties properties = new Properties();

    private JDBCTool() {
        logger.info("初始化JDBC工具类");
        try {
            InputStream path = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(path);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("JDBC config error!!!");
        }
    }

    public void save() {
        logger.info("保存");
    }
}
