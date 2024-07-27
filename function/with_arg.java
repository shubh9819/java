package function;
class employee{
    static void info(String name , int age) {
        System.out.println("name "+name);
        System.out.println("age "+age);
    }
    static void full_info(String name,int age,float height){
        System.out.println("name  "+name);
        System.out.println("age  "+age);
        System.out.println("height  "+height);

    }
    public static void main(String[] args) {
        info("shubh",21);
        full_info("shubham",23,5.9f);
    }
}

