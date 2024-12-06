package locale;

import java.util.Locale;

public class locale {
    public static void main(String[] args) {
        Locale l=new Locale("mr","IN");
        System.out.println("language  :"+l.getDisplayLanguage());
        System.out.println("country  :"+l.getDisplayCountry());
        System.out.println("name  :"+l.getDisplayName());
    }

}
