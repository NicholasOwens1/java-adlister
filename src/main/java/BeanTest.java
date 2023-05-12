import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "BeanTest", urlPatterns = "/bean")

public class BeanTest extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Album Thriller = new Album();
        Album PurpleRain = new Album();
        Album Bad = new Album();
        Author MarkTwain = new Author();
        Author RLStine = new Author();
        Author LemonySnickett = new Author();
        Quote q1 = new Quote();
        Quote q2 = new Quote();
        Quote q3 = new Quote();
        ArrayList<Quote> quotes = new ArrayList<Quote>();
        quotes.add(q1);
        quotes.add(q2);
        quotes.add(q3);
        q1.setAuthor("Mark Twain");
        q2.setAuthor("RL Stine");
        q3.setAuthor("Lemony Snickett");
        for (Quote quote : quotes) {
            System.out.println(quote.getAuthor());
        }
    }
}
