package locale;
//import java.util.Locale;
import java.util.*;

public class Locale3 {
    public static void main(String[] args) {
        Locale a=new Locale("en","US");
        Locale b=new Locale("fr","FR");
        Locale c=new Locale("es","ES");
        Locale d=new Locale("guj","IN");
        System.out.println("english lang in us :"+a.getDisplayLanguage());
        System.out.println("english lang in fr :"+b.getDisplayLanguage());
        System.out.println("english lang in es :"+c.getDisplayLanguage());
        System.out.println("english lang in in :"+d.getDisplayLanguage());


    }
}
