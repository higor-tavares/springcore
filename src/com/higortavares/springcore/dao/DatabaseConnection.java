package com.higortavares.springcore.dao;

public class DatabaseConnection {

  private String jdbcUrl;
  private String username;
  private String password;

  public DatabaseConnection(String jdbcUrl, String username, String password) {
    this.jdbcUrl = jdbcUrl;
    this.username = username;
    this.password = password;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
