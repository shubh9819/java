package locale;
import java.util.Locale;

public class localchange {
    public static void main(String[] args) {
        Locale[] l = {new Locale("en", "US"),new Locale("os","ES"),new Locale("it","IT")};
        for (int i=0;i<l.length;i++){
            String display=l[i].getDisplayLanguage(l[i]);
            System.out.println(l[i].toString()+"  "+display);
        }
    }
    }
