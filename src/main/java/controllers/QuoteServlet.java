package controllers;  import dao.Quotes;
import dao.QuotesDao;
import models.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class QuoteServlet {
    @WebServlet(name = "QuotesServlet", urlPatterns = "/quotes")
    public class QuotesServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Quotes quotesDao = new QuotesDao();
            List<Quote> quotes = null;
            try {
                quotes = quotesDao.all();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            req.setAttribute("quotes", quotes);
            req.getRequestDispatcher("/WEB-INF/quotes/quotes.jsp").forward(req, resp);
        }
    }
}
