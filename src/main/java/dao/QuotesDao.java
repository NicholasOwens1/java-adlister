package dao;

import models.Author;
import models.Quote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class QuotesDao implements Quotes{

    private Connection connection;
    public QuotesDao(){
        try {
            DriverManager.registerDriver(new Driver() {
                @Override
                public Connection connect(String url, Properties info) throws SQLException {
                    return null;
                }

                @Override
                public boolean acceptsURL(String url) throws SQLException {
                    return false;
                }

                @Override
                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                    return new DriverPropertyInfo[0];
                }

                @Override
                public int getMajorVersion() {
                    return 0;
                }

                @Override
                public int getMinorVersion() {
                    return 0;
                }

                @Override
                public boolean jdbcCompliant() {
                    return false;
                }

                @Override
                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                    return null;
                }
            });
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "codeup_test_user",
                    "codeup");
        } catch (SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }
    @Override
    public List<Quote> all() throws SQLException {
        Authors authorsDao = new AuthorsDao();
        List<Author> authors = authorsDao.all();
        List<Quote> quotes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            while (rs.next()){
                int author_id = rs.getInt("author_id");
                Author quoteAuthor = null;
                for(Author author : authors){
                    if (author.getId() == author_id){
                        quoteAuthor = author;
                    }
                }
                Quote quote = new Quote(
                        rs.getInt("id"),
                        rs.getString("content"),
                        quoteAuthor
                );
                quotes.add(quote);
            }
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
        return quotes;
    }
    @Override
    public void insert(Quote quote) {
    }
}