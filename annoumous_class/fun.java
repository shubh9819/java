package annoumous_class;
@FunctionalInterface
interface showname{
    void show();
}

public class fun {
    public static  void main(String[] args) {
        showname ab=new showname(){

            public void show(){
                System.out.println("annoumous class");
            }
        };
        ab.show();
    }
}
