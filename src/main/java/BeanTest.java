import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
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
        for (Quote quote : quotes) {
            System.out.println(quote.getAuthor() + " said " + quote.getQuote());
        }
    }
}
