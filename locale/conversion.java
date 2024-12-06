package locale;
import java.util.Locale;

import java.util.ResourceBundle;
import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        Locale loc;
        if(no==1)
        {
            System.out.println("english");
            loc=new Locale("en","US");

        }

        else
        {
            System.out.println("french");
            loc=new Locale("fr","FR");
        }
        ResourceBundle bundle=ResourceBundle.getBundle("resource",loc);
        System.out.println(bundle.getString("greeting"));
        System.out.println(bundle.getString("course"));
//        locale loc=new locale();
//        System.out.println("english");
//        loc=new locale("en","US");
    }
}
