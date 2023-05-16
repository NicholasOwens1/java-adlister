package dao;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    private static List<String> getAuthornames(){
    List<String> authorNames = new ArrayList<>();
    try{
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup");
//        Create statement
        Statement statement = connection.createStatement();
//        Execute statement
        ResultSet resultSet = statement.executeQuery("SELECT first_name FROM employees.employees");
    } catch (SQLException sqlx) {
        sqlx.printStackTrace();
    }
    return authorNames;
    }
}
