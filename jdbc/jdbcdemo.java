package jdbc;


import java.sql.*;

public class jdbcdemo{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver registered");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
        System.out.println("Connection established");

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from empinfo");
        rs.next();

        //System.out.println(rs.getString(1)+"records");
        while(rs.next())
        {
            System.out.println(rs.getString(1) +"\t" +rs.getInt(2)+"\t" +rs.getInt(3)+"\t" +rs.getString(4));
        }


    }

}
