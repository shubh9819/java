package Collection;
import java.util.*;
import java.util.Comparator;

public class work  {
    String emp_name;
    int emp_id;
    int salary;

    public work(String emp_name, int emp_id, int salary) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.salary = salary;
    }



    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "work{" +
                "emp_name='" + emp_name + '\'' +
                ", emp_id=" + emp_id +
                ", salary=" + salary +
                '}';
    }
}
    class emp_ID implements Comparator<work>{
    @Override

    public int compare(work o1, work o2) {
        return o1.emp_id - o2.emp_id;

    }
}
//055148
class emp_Name implements Comparator<work>
{
    public int compare(work o1,work o2){
        return (int) o1.emp_name.compareTo(o2.emp_name);
}
}
class SAlary implements Comparator<work>
{
    public int compare(work o1, work o2){
        return o1.salary-o2.salary;
    }
}