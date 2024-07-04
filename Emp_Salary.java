//User Input
//        ----------------
//        Employee ID  = OA90
//        Employee Name = Omji
//        Month = 3
//        year = 2024
//        Leaves = 14
//        Conveyance Allowance = 5%
//        Medical Allowance = 10%
//        Other Allowances = 3%
//        Salary Basic = 56000/-
//        Professional Tax = 10%
//        ----------------
//
package Salary_System;
import java.util.Scanner;

public class Emp_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int emp_id, year, leave, m_salary,total_day=0;

        String name, month;

        float conveyance, medical, other, professional_tax;


        System.out.println("enter employee id ");
        emp_id = sc.nextInt();

        System.out.println("enter employee name ");
        name = sc.next();

        System.out.println("enter enter the current year ");
        year = sc.nextInt();

        System.out.println("enter the leave day ");
        leave = sc.nextInt() ;

        System.out.println("enter the monthly salary of employee");
        m_salary = sc.nextInt();

        System.out.println("enter the conveyance allowance % ");
        conveyance = sc.nextFloat();

       System.out.println("enter the medical allowance % ");
        medical = sc.nextFloat();

        System.out.println("enter other allowance % ");
        other = sc.nextFloat();

        System.out.println("enter professional tax %");
        professional_tax = sc.nextFloat();

        System.out.println("enter the current month ");
        month = sc.next();


        switch(month){
            case "january":
                total_day= 31;

                break;
            case "february":
                if((year%400==0 &&  year%100!=0) || (year%4==0)){
                    total_day= 29;
                }
                else{
                    total_day= 28;
                }

                break;
            case "march":
                total_day= 31;

                break;
            case "april":
                total_day=30;
                break;
            case "may":
                total_day=31;

                break;
            case "june":
                total_day=30;
                break;
            case "july":
                total_day=31;

                break;
            case "august":
                total_day=31;
                break;
            case "september":
                total_day=30;

                break;
            case "october":
                total_day=31;
                break;
            case "november":
                total_day=30;

                break;
            case "december":
                total_day=31;
                break;
            default:
                System.out.println("enter proper month in small letter ");

        }


   //     Paid Days = 17 Days (Leave Days - Month Days)
//        Basic Salary = 56000/-
//        Total Working Days = 31 (Month Days)
//        Leaves Amount =  25290.32 (Month Days - Leave Days)
//        Conveyance Allowance = 33600/-  (Yearly Salary*Conveyance Allowance/100)
//        Medical Allowance =  67200/- (Yearly Salary*Medical Allowance/100)
//        Other Allowances = 20160/- (Yearly Salary*Other Allowances/100)
//        CTC = 786240/- ((Monthly Salary *12)+Conveyance Allowance+Medical Allowance+Other Allowances)
//        Total Allowance = 120960/- (Conveyance Allowance+Medical Allowance+Other Allowances)
//        Professional Tax = 2276.12/- (Basic Salary - leave amount ) - (Total Salary*Professional Tax/100)
//        Total Deductions = 27566.12/- (Professional Tax + Leaves Amount ) - Basic Salary
//        Total Earnings Allowance  Monthly = 10080/- (Conveyance Allowance+Medical Allowance+Other Allowances)
//        Net Salary   = 28434/- (Total Earnings Allowance  Monthly + Basic Salary) - Total Deductions
//        Month = 	March/2024

        int paid_days = total_day - leave;
        System.out.println("total paid days= "+paid_days);

        int basic_salary = m_salary * 12;
        System.out.println("annual salary is "+basic_salary);

        System.out.println("total working days in this month is " +total_day);

        float per_day_salary = m_salary / total_day;



        float leaves_deduction_amount = leave * per_day_salary;
        System.out.println("total leave amount deducted "+leaves_deduction_amount);

        float leave_amount = m_salary - leaves_deduction_amount;
        System.out.println("salary after deduction "+leave_amount);


        System.out.println("per day salary is "+per_day_salary);

        float conveyance_allowance = basic_salary * conveyance/100;
        System.out.println("total conveyance allowance "+conveyance_allowance);

        float medical_allowance =  basic_salary * medical/100;
        System.out.println("total medical allowance is "+medical_allowance);

        float other_allowance = basic_salary * other /100;
        System.out.println("total other allowance "+other_allowance);

        float total_allowance = conveyance_allowance + medical_allowance + other_allowance;
        System.out.println("overall allowance is "+total_allowance);

        float pro_tax = basic_salary * professional_tax /100;
        System.out.println("total professional tax is "+pro_tax);

        float ctc = basic_salary + total_allowance;
        System.out.println("xyz"+ctc);

        float salary = basic_salary-leaves_deduction_amount-pro_tax;
        System.out.println("new salary after tax deduction "+salary);






    }

}
