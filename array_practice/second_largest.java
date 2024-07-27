package array_practice;
import java.util.Arrays;


public class second_largest {
    public static void main(String[] args) {
        int  [] arrays={4, 6, 4, 2, 32, 43, 6, 40, 9990, 10000};
        Arrays.sort(arrays);
        System.out.println(arrays[arrays.length-2]);

    }
}
