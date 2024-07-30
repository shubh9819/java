//Input Section
//Student Details:
//
//Name
//Roll Number
//Marks:
//
//JAVA
//C++
//Go
//        Ruby
//C#
//Python
//Output Section
//Display the marks for each subject.
//Calculate and display the total marks and percentage.
//Determine and display the pass/fail status based on the percentage.
//If the student passes, display the grade according to the grading system.
//        Grading System
//80 - 100: Grade A
//60 - 80: Grade B
//40 - 60: Grade C
//30 - 40: Grade D
//Pass/Fail Criteria
//A student must have a minimum percentage of 40% to pass.
//Instructions
//Create a Student class to store the student's name, roll number, and marks for each subject.
//Create methods for calculating total marks, percentage, and determining the pass/fail status.
//Create methods for assigning grades if the student passes.
//Implement input validation to ensure marks are between 0 and 100.
//Example
//        Input
//Enter your name: Nishant
//Enter Your Roll Number: A1023
//
//Enter Your JAVA Marks: 50
//Enter Your C++ Marks: 20
//Enter Your Go Marks: 25
//Enter Your Ruby Marks: 96
//Enter Your C# Marks: 70
//Enter Your Python Marks: 65
//Output
//Student Report Card
//-------------------
//Name: Nishant
//Roll Number: A1023
//
//Marks:
//JAVA = 50/100
//C++ = 20/100 F
//        Go = 25/100 F
//        Ruby = 96/100
//C# = 70/100
//Python = 65/100
//
//Total = 326/600
//Percentage = 54%
//Status: FAIL
//
//Grading System (if passed):
//        80 - 100 = Grade A
//60 - 80 = Grade B
//40 - 60 = Grade C
//30 - 40 = Grade D
package grade_system;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class student{
    Scanner sc=new Scanner(System.in);
    String name;
    int rollno,java,c_plus,go,ruby,c,python,total=100;


     public void input(){
         System.out.println("enter the student name: ");
         name=sc.next();
         System.out.println("enter the student roll_no: ");
         rollno=sc.nextInt();

         System.out.println("----------------Subject marks here------------------");




     }
     public void marks(){
         System.out.println("enter the java marks: ");
         java= sc.nextInt();
         System.out.println("enter the c_plus marks: ");
         c_plus=sc.nextInt();
         System.out.println("enter the go marks: ");
         go=sc.nextInt();
         System.out.println("enter the ruby marks: ");
         ruby=sc.nextInt();
         System.out.println("enter the c marks: ");
         c=sc.nextInt();
         System.out.println("enter the python marks: ");
         python=sc.nextInt();
     }
     public void display() {
         System.out.println("---------------------------------------STUDENT  REPORT  CARD ----------------------------------------------------");
         System.out.println("Name of Student: " + name);
         System.out.println("Roll_number: " + rollno);
         System.out.println("-----------------------------------Subject Marks-----------------------------------------------------");
         if (java <= 30) {
             System.out.println("Java: " + java + "/" + total + " Fail");
         } else if (java <=40) {
             System.out.println("Java: " + java + "/" +  total + " D");
         } else if (java<=60) {
             System.out.println("Java: " + java + "/" +  total + " c");

         }else if(java<=80){
             System.out.println("Java: " + java + "/" +  total + " B");
         }else if(java<=100){
             System.out.println("Java: " + java + "/" +  total + " A");
         }
         System.out.println("...................");
         if (c_plus <= 30) {
             System.out.println("C_Plus: " +c_plus  + "/" +  total + " Fail");
         } else if (c_plus <=40) {
             System.out.println("C_Plus: " + c_plus  + "/" +  total + " D");
         } else if (c_plus <=60) {
             System.out.println("C_Plus: " +c_plus + "/" +  total+ " c");

         }else if(c_plus <=80){
             System.out.println("C_Plus: " + c_plus + "/" +  total + " B");
         }else if(c_plus <=100){
             System.out.println("C_Plus: " +c_plus + "/" +  total + " A");
         }

         System.out.println(".............................");
         if (go <= 30) {
             System.out.println("C_Plus: " +go  + "/" +  total + " Fail");
         } else if (go  <=40) {
             System.out.println("C_Plus: " + go + "/" +  total + " D");
         } else if (go <=60) {
             System.out.println("C_Plus: " +go + "/" +  total + " c");

         }else if(go <=80){
             System.out.println("C_Plus: " + go  + "/" +  total + " B");
         }else if(go <=100){
             System.out.println("C_Plus: " + go  + "/" +  total + " A");
         }

         System.out.println(".............................");
         if (ruby <= 30) {
             System.out.println("Ruby: " + ruby  + "/" +  total + " Fail");
         } else if (ruby  <=40) {
             System.out.println("Ruby: " +ruby  + "/" +  total + " D");
         } else if (ruby <=60) {
             System.out.println("Ruby: " + ruby  + "/" +  total + " c");

         }else if(ruby <=80){
             System.out.println("Ruby: " + ruby  + "/" + total + " B");
         }else if(ruby <=100){
             System.out.println("Ruby: " + ruby  + "/" +  total + " A");
         }

         System.out.println(".............................");

         if (c <= 30) {
             System.out.println("C: " + c  + "/" +  total + " Fail");
         } else if (c  <=40) {
             System.out.println("C: " +c  + "/" +  total + " D");
         } else if (c <=60) {
             System.out.println("C: " +c + "/" +  total + " c");

         }else if(c <=80){
             System.out.println("C: " +c  + "/" +  total + " B");
         }else if(c <=100){
             System.out.println("C: " +c + "/" +  total + " A");
         }

         System.out.println(".............................");


         if (python  <= 30) {
             System.out.println("Python: " + python   + "/" +  total + " Fail");
         } else if (python  <=40) {
             System.out.println("Python: " +python   + "/" +  total + " D");
         } else if (python  <=60) {
             System.out.println("Python: " +python  + "/" +  total + " c");

         }else if(python  <=80){
             System.out.println("Python: " +python  + "/" +  total + " B");
         }else if(python  <=100){
             System.out.println("Python: " +python  + "/" +  total + " A");
         }

         System.out.println(".............................");



//         int total_marks=java+c_plus+go+c+python;
//         System.out.println("sum= "+total_marks);
//         float percentage=(float) (total_marks*100/600);






//         System.out.println("Java marks: "+java+"/100");
//         System.out.println("C_Plus  marks: "+c_plus+"/100");
//         System.out.println("Go marks: "+go+"/100");
//         System.out.println("C marks: "+c+"/100");
//         System.out.println("Python marks: "+python+"/100");


     }
    int total_marks(){
        int total_marks=java+c_plus+go+c+python;
        return total_marks;

    }
    float percentage(){
         float percentage=(float) (total_marks()*100/600);
         return percentage;

    }

     public void status(){
         if (java>30 && go>30 && c_plus>30 && ruby>30 && c>30 && python>30 || percentage()>30){
             System.out.println("status: pass");
         }else{
             System.out.println("status: Fail");
         }
     }


}



public class grade_system_with_function {
    public static void main(String[] args) {
        student grade=new student();
        grade.input();
        grade.marks();
        grade.display();
        System.out.println("total marks is : "+(grade.total_marks()));
        System.out.println("Percentage  is : "+(grade.percentage()));
        System.out.println(("........................"));
        grade.status();

    }

}
