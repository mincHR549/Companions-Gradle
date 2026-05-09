package com.zaxxer.hikari;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class HikariDataSource implements DataSource {
    public HikariDataSource() {}
    public Connection getConnection() { return null; }
    public Connection getConnection(String u, String p) { return null; }
    public void close() {}
    public void setJdbcUrl(String url) {}
    public void setUsername(String u) {}
    public void setPassword(String p) {}
    public void setDriverClassName(String c) {}
    public void setMaximumPoolSize(int n) {}
    public void setMinimumIdle(int n) {}
    public void setConnectionTimeout(long ms) {}
    public void setIdleTimeout(long ms) {}
    public void setPoolName(String n) {}
}
