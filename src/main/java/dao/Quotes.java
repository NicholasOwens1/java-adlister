package dao;

import models.Quote;

import java.sql.SQLException;
import java.util.List;

public interface Quotes {
    List<Quote> all() throws SQLException;
    void insert(Quote quote);
}
