import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet (name = "LooperServlet", urlPatterns = "/looper")
public class LooperServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ListAdsDao listAdsDao = (ListAdsDao) DaoFactory.getAdsDao();
        System.out.println("working");
        req.setAttribute("ads", listAdsDao.all());
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}
