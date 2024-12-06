package jdbc;

import java.sql.*;
import java.util.Scanner;
//
//import static jdk.internal.org.jline.keymap.KeyMap.display;

public class Database2 {
    static Connection connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection con= DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","");
        System.out.println("Connection established");
        return con;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc=new Scanner (System.in);
        Connection con=connect();
        Statement stmt=con.createStatement();
        System.out.println("Enter DeptNo.: ");
        int deptNo=sc.nextInt();
        System.out.println("Enter sal: ");
        int sal=sc.nextInt();
        //-------------Update------------------
        PreparedStatement pmt=con.prepareStatement("update emp set salary=? where Deeptno=?");
        pmt.setInt(1,sal);
        pmt.setInt(2,deptNo);
        int no=pmt.executeUpdate();
        System.out.println(no+"records are updated");
        display();
        System.out.println(delete()+"record deleted");
        display();
    }

    static int delete() throws ClassNotFoundException,SQLException{
        Scanner sc=new Scanner(System.in);
        Connection con=connect();
        Statement stmt=con.createStatement();
        System.out.println("Enter Empno: ");
        int empno=sc.nextInt();
        PreparedStatement pmt=con.prepareStatement("delete from emp where Empno=?");
        pmt.setInt(1,empno);
        int no= pmt.executeUpdate();
        return no;
    }

    static void display() throws SQLException,ClassNotFoundException {
        Connection con=connect();
        Scanner sc=new Scanner(System.in);
        Statement stmt=con.createStatement();
        System.out.println("Enter Deptno: ");
        int deptno=sc.nextInt();

        ResultSet res=stmt.executeQuery("select * from emp where Deptno="+deptno);
        System.out.println("Empno\tName\tSalary\tDeptno");
        while(res.next()){
            System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getInt(3)+"\t"+res.getInt(4));
        }
    }


}