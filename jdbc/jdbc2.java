package jdbc;
import java.sql.*;
public class jdbc2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver registerd");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
        System.out.println("connection established");
        con.setAutoCommit(false);
        PreparedStatement ps=con.prepareStatement("insert into empinfo values(?,?,?,?)");
        ps.setString(1,"shubh");
        ps.setInt(2,232);
        ps.setInt(3,22);
        ps.setString(4,"engineering");
        ps.addBatch();

        ps.setString(1,"ubh");
        ps.setInt(2,3662);
        ps.setInt(3,2552);
        ps.setString(4,"enineer");
        ps.addBatch();
        ps.executeBatch();
        con.commit();
        System.out.println("records inserted successfully");

    }



}
