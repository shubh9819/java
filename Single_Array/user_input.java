package Single_Array;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter the size of items");
        size = sc.nextInt();
        String[] items = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the product" + (i + 1));
            items[i] = sc.next();
        }
        System.out.println("//////////////////////////////");
        for (int i=0;i<size;i++){
            System.out.println("data="+items[i]);
        }

    }

}