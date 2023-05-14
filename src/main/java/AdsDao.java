import java.awt.*;
import java.util.ArrayList;
import java.util.List;

interface AdsDao {
    List<Ad> all();
    void insert (Ad ad);
}
