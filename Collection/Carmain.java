package Collection;
import java.util.*;


public class Carmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Car> ob=new HashMap<String , Car>();
        ob.put("Sedan", new Car("Audi A4",15,50000000));
        ob.put("Hatchback", new Car("Honda civic",10,30000000));
        ob.put("MUV", new Car("Kia Carens",10,40000000));
        System.out.println("Enter the name of Car you want to search :");
        String newname=sc.next();

        for(Map.Entry<String,Car> obj:ob.entrySet()){
            if (obj.getKey().equals(newname)){
                System.out.println(obj.getValue());
            }

        }

    }
}
