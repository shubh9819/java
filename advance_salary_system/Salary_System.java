package advance_salary_system;
import java.util.Scanner;

class Employee {
    Scanner sc = new Scanner(System.in);
    String name, designation, department;
    int id;
    int salary;
    int hra, dearness, pf, medical;

    public void detail() {
        System.out.println("enter the name of employee: ");
        name = sc.next();
        System.out.println("enter the id of employee: ");
        id = sc.nextInt();
        System.out.println("enter the basic salary of employee: ");
        salary = sc.nextInt();
        System.out.println("enter the designation of employee: ");
        designation = sc.next();
        System.out.println("enter the department of employee: ");
        department = sc.next();
    }
    public void salary_compo() {

        System.out.println("enter the hra allowance%: ");
        hra = sc.nextInt();
        System.out.println("enter the dearness allowance %: ");
        dearness = sc.nextInt();
        System.out.println("enter the provident fund :%: ");
        pf = sc.nextInt();
        System.out.println("medical allowance amount: ");
        medical = sc.nextInt();

        System.out.println();
        System.out.println();
    }

    public void display() {
        System.out.println("......Employee Salary Details......");
        System.out.println("............................................");
        System.out.println("Employee Name  : " + name);
        System.out.println("Employee ID  :" + id);
        System.out.println("Employee Designation  :" + designation);
        System.out.println("Employee Department  :" + department);
    }

    int salary_calc1() {
        int dearness_amount = (salary * dearness / 100);
        return dearness_amount;
    }

    int salary_calc2() {
        int pf_amount = (salary * pf / 100);
        return pf_amount;

    }

    int salary_calculate() {
        int hra_amount = (salary * hra / 100);
        return hra_amount;
    }
    public void display1() {
        System.out.println();
        System.out.println();
        System.out.println("Basic Salary :" + salary);
        System.out.println("Medical Amount ;" + medical);

    }
    int gross_salary() {
        int gross_salar = salary + salary_calculate() + salary_calc1() + medical;
        return gross_salar;


    }
    int net_salary(){
        int net_salar=gross_salary()-  salary_calc2();
        return net_salar;
    }

}
public class Salary_System {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("..............Employee Details.....................");
        emp.detail();
        emp.salary_compo();
        emp.display();
        System.out.println();
        System.out.println();
        System.out.println("Employee Basic Salary  :" + emp.salary);
        System.out.println("House Rent Allowance(HRA) :"+emp.salary_calculate());
        System.out.println("Dearness Allowance(DA) :" + emp.salary_calc1());
        System.out.println("Provident Fund(PF) :" +emp.salary_calc2());
        System.out.println();
        System.out.println();
        System.out.println("gross_salary: "+emp.gross_salary());
        System.out.println("Net salary : "+emp.net_salary());
    }
}
