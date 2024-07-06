package Operator;

public class if_else {
    public static void main(String[] args) {
        int a ,b , c;
        a = 10;
        b = 90;
        c = 77;

        if(a>b && a>c){
            System.out.println("a is greater");

        }
        else if(b>c && b>a){

            System.out.println("b is greater");

        }
        else{
            System.out.println("c is greater");
        }

    }
}
