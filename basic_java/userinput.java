package basic_java;
import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        //creating object
        Scanner sc = new Scanner(System.in);
        String name;
        String address;
        float height;
        double number;
        char grade;


        System.out.println("enter your name ");
        name = sc.nextLine();
        System.out.println("enter your mobile number ");
        number = sc.nextDouble();
        System.out.println("enter your height ");
        height = sc.nextFloat();
        System.out.println("enter your address ");
        address = sc.nextLine();
        System.out.println("enter your grade ");
        grade = sc.next().charAt(0);


        System.out.println("////////////////////output/////////////////////////////");

        System.out.println("your name is "+name);
        System.out.println("your mobile number is "+number);
        System.out.println("your height is "+height);
        System.out.println("your address is "+address);
        System.out.println("your grade is "+grade);







    }
}
