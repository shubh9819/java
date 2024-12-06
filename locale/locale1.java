package locale;

import java.util.Locale;

public class locale1 {
    public static void main(String[] args) {
        Locale l[]=Locale.getAvailableLocales();
        for(Locale m:l){
            if (m.getCountry().equals("IN")){
            System.out.println("country name :  "+m.getDisplayCountry());
           // System.out.println("country name :  "+m.getCountry());
          //  System.out.println("language : "+m.getLanguage());
            System.out.println("language : "+m.getDisplayLanguage());
        }}
    }
}
