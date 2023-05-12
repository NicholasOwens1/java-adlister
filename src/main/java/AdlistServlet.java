import javax.imageio.stream.ImageInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@WebServlet (name = "AdlistServlet", urlPatterns = "/ads")
public class AdlistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ListAdsDao listAdsDao = (ListAdsDao) DaoFactory.getAdsDao();
        System.out.println("working");
        req.setAttribute("ads", listAdsDao.all());
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}