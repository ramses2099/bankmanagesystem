package com.jprograming.db;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbConnectionPostgress {
    private static final Logger LOGGER = LogManager.getLogger(DbConnectionPostgress.class);
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/bankmanagesystem";
    private static final String DB_USER = "postgres";
    private static final String DB_PDW = "pwd01";
    private Connection connection;
    private PreparedStatement preparedStatement;

    public DbConnectionPostgress() {

        try {
            Class dbDriver = Class.forName("org.postgresql.Driver");
            //
            connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PDW);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    public void testConnection(){
        String sql ="select version();";
        try{
            LOGGER.info("open connection db");
            if(connection == null){
                LOGGER.error("error connection is not open");
            }
            preparedStatement = connection.prepareStatement(sql);
            boolean rows = preparedStatement.execute();
            //
            if(rows){
                LOGGER.info("Connection Successfully");
            }

        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }
    }
}
