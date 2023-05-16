package dao;

import models.Author;

import java.sql.SQLException;
import java.util.List;

public interface Authors {
    List<Author> all() throws SQLException;
    // insert a new ad and return the new ad's id
    Long insert(Author author);
}

