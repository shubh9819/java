package jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc1 {
    static  Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver registerd");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
        System.out.println("connection established");
        return con;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner (System.in);
        Connection con=connect();
        Statement sm=con.createStatement();
        System.out.println("enter deptno");
        int deptno=sc.nextInt();
        System.out.println("enter the salary");
        int salar=sc.nextInt();




    }

}
