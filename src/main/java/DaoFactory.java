public class DaoFactory {
    private static AdsDao adsDao;

    public static AdsDao getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAds();
        }
        return adsDao;
    }
}
