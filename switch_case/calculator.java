package switch_case;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;


        System.out.println("enter first number ");
        a = sc.nextInt();


        System.out.println("enter second number ");
        b = sc.nextInt();

        System.out.println("enter the operator| + | - | * | / | ");
        char operator = sc.next().charAt(0);

        int result;
        switch(operator){
            case '+':
                result=a+b;
                System.out.println("result is "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("result is "+result);
                break;
            case '*':
                result=a*b;
                System.out.println("result is "+result);
                break;
            case '/':
                result=a/b;
                System.out.println("result is "+result);
                break;

            default:
                System.out.println("please enter valid operator");
                break;

        }
    }
}
