package com.datzm029.dem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class DatabaseConnectionTest {

    @Autowired
    private DataSource dataSource;
//http://localhost:8080/test
    @GetMapping(value = "/test")
    public String testDataSourceConnection() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            return "Successfully connected to the database";
        } catch (SQLException e) {
            return "Failed to connect to the database";
        }
    }
}

