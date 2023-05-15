package config;

public class Config {
    public static String getUrl(){
        return "jdbc:mysql://localhost:3306/bigfoot_test-db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public static String gitUserName(){
        return "codeup_test_user";
    }
    public static String getPassword(){
        return "codeup";
    }
}
