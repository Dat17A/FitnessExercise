package patterns;
import static patterns.Singleton.getSingleton;

public class MainSingleton {
    public static void main(String[] args) {
        //Singleton s1 = new Singleton();
        //Singleton s2 = new Singleton();

        int i=0;
        System.out.println(i);


        Singleton s1 = getSingleton();
        Singleton s2 = getSingleton();

        System.out.println(s1.getDbConn());

        System.out.println(s1);
        System.out.println(s2);

        //System.out.println(s1);
        //System.out.println(s2);
    }
}
