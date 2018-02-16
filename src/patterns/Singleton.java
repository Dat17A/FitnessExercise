package patterns;

public class Singleton {
    private static Singleton singleton
            = new Singleton();
    private String testDbConn = "I am a db conn. dummy";

    private Singleton() {

    }


    public static Singleton getSingleton() {
        return singleton;
    }


    public String getDbConn() {
        // Returns string here to test...
        return testDbConn;
    }
}
