package access_control;

public class variabletype {
        int a=10;
        public int b=20;
        private int c=30;
        protected int d=40;
        //default int e=122;
        public  variabletype(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }


        public static void main(String[] args) {

            variabletype t=new  variabletype();
            System.out.println(t.a);
            System.out.println(t.b);
            System.out.println(t.c);
            System.out.println(t.d);

        }
    }

