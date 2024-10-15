package Collection;
import java.util.*;


public class practice {
    public static void main(String[] args) {


        List<String> emp = new ArrayList<String>();
        emp.add("Joy");
        emp.add("djhjdf");
        emp.add("wriet");
        emp.add("shubhamn");

        emp.remove(0);
        emp.set(1,"joyy");
//        System.out.println(emp);

        String arr[]={"ss","e","ss"};
        List<String> t=Arrays.asList(arr);
        emp.addAll(t);
        System.out.println("...................................");
        for(String c:emp){
            System.out.println(c);
        }
//Iterator<String> abc=emp.iterator();
//        while(abc.hasNext()){
//            System.out.println(abc.next());
        }
    }
//}