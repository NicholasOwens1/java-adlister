package dao;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;
import models.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors {
    private Connection connection;
    public AuthorsDao() throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
    }
    @Override
    public List<Author> all() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs  = statement.executeQuery("SELECT * FROM authors");
        List<Author> authors = new ArrayList<>();
        while (rs.next()) {
            authors.add(new Author(
                    rs.getLong("id"),
                    rs.getString("name")
            ));
        }
        return authors;
    }

    @Override
    public Long insert(Author author) {
        return null;
    }


}
