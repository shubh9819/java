package locale;
import java.util.Date;
import java.util.Locale;

import java.text.DateFormat;
import java.util.Locale;

public class interdate {
    public static void printdate(Locale loc) {
        DateFormat f=DateFormat.getDateInstance(DateFormat.FULL, loc);
        Date currentdate=new Date();
        String date=f.format(currentdate);
        System.out.println(date+">>>>"+loc);

    }

    public static void main(String[] args) {
        printdate(Locale.UK);
        printdate(Locale.US);
        printdate(Locale.FRANCE);
        printdate(Locale.GERMAN);
    }
}
