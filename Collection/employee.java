package Collection;
import java.util.*;

public class employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        List<work> abc=new ArrayList<work>();
        String name ;
        int new_id,update_id;
        int salary,id=0;
        int o=abc.size(),z=0;
        int sorting=0;

        while(true) {
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. search");
            System.out.println("6. Sorting");
            System.out.println("select any 1 option ");

            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("enter the name of employee: ");
                    name = sc.next();
                    System.out.println("enter the id of employee: ");
                    id = sc.nextInt();
                    System.out.println("enter the salary of employee: ");
                    salary = sc.nextInt();
                    abc.add(new work(name, id, salary));
                    break;
//                case 3: {
//                    System.out.println("enter the id number you want to remove :");
//                    abc.remove(1);
//                }

                case 2:
                System.out.println("enter the id you want to update : ");
                update_id=sc.nextInt();
                Iterator<work> a=abc.iterator();
                while(a.hasNext()){
                    work ob=a.next();
                    if(ob.getEmp_id()==update_id){
                        System.out.println("enter the name of Employee :");
                        String name1=sc.next();
                        System.out.println("enter the id of employee :");
                        int id1=sc.nextInt();
                        System.out.println("enter the salary of employee :");
                        int salary1=sc.nextInt();
                        ob.setEmp_name(name1);
                        ob.setEmp_id(id1);
                        ob.setSalary(salary1);

                    }
                }
                break;
                case 3:
                    System.out.println("enter the id you want to delete :");
                    new_id=sc.nextInt();
                    Iterator<work> w=abc.iterator();
                    while (w.hasNext()){
                        work n=w.next();
                        if(n.getEmp_id()==new_id){
                            abc.remove(n);
                        }
                    }
//
//                    for (int i=0;i<o;i++){
//                        z++;
//
//                        if(new_id==abc.get(i).getEmp_id()){
//                            break;
//                        }
//                        abc.remove(new_id);
//                        System.out.println(abc.get(z));
//
//                    }
                    break;

                case 4:
                    for (work aa : abc) {

                        System.out.println(aa);
                    }
//                    Iterator<work> m=abc.iterator();
//                    while(m.hasNext()){
//                        work abcc=m.next();
//                            System.out.println(abcc);
//                        break;
//                    }

                break;
                case 5:
                    System.out.println("enter the id you want to search :");
                    new_id=sc.nextInt();
                    Iterator<work> as=abc.iterator();
                    while(as.hasNext()){
                        work ab=as.next();
                        if(ab.getEmp_id()==new_id){
                            System.out.println(ab);
                        }
                    }



//                    for(int i=0;i<o;i++)
//                    {
//
//                    if (new_id==abc.get(i).getEmp_id()) {
//                        System.out.println(abc.get(i));
//                        System.out.println("");
//                        break;
//                    }
//                    }

                break;
                default:
                    System.out.println("enter the proper option");
                    break;
                case 6:
                    System.out.println("1. sorting by id :");
                    System.out.println("2. sorting by name :");
                    System.out.println("3. sorting by salary :");
                    System.out.println("select any option :");
                    sorting=sc.nextInt();
                    switch(sorting){
                        case 1:
                            System.out.println("sorting by id :");
                            Collections.sort(abc, new emp_ID());
                            for(work h:abc){
                                System.out.println(h);
                            }
                            break;
                        case 2:
                            System.out.println("sortig by name :");
                            Collections.sort(abc,new emp_Name() );
                            for(work wb:abc){
                                System.out.println(wb);
                            }
                            break;
                        case 3:
                            System.out.println("sorting by salary :");
                            Collections.sort(abc , new SAlary());
                            for(work qq:abc){
                                System.out.println(qq);
                            }

                    }




            }
        }










    }
}
