package patterns;
import java.util.ArrayList;

import static patterns.Singleton.getSingleton;

public class MainSingleton {
    public static void main(String[] args) {
        //Singleton s1 = new Singleton();
        //Singleton s2 = new Singleton();

        String s1 = "1";
        String s2 = "2";
ArrayList<String> strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);

        // for loop
        for(int i=0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }


        // for each
        //  type var-navn: listen
        for(String s: strings) {
            System.out.println(s);
        }




        int i=0;
        System.out.println(i);

/*
        Singleton s1 = getSingleton();
        Singleton s2 = getSingleton();

        System.out.println(s1.getDbConn());

        System.out.println(s1);
        System.out.println(s2);
*/
        //System.out.println(s1);
        //System.out.println(s2);
    }
}
