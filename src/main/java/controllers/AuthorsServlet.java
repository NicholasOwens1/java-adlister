package controllers;

import dao.Authors;
import dao.AuthorsDao;
import models.Author;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "controllers.AuthorsServlet", urlPatterns = "/authors")
public class AuthorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Authors authorsDao = new AuthorsDao();
            List<Author> authors = authorsDao.all();
            req.setAttribute("authors", authors);
            req.getRequestDispatcher("/WEB-INF/authors.jsp").forward(req, resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
