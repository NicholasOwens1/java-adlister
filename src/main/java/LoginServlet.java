import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
       if (username == username && password == password) {
            request.getSession().setAttribute("username", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
    }
