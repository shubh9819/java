package jdbc;

import java.sql.*;

public class DataMeta {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver registerd");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","Aptech@123");
        System.out.println("connection established");
        Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery("select * from info");
        ResultSetMetaData mm=rs.getMetaData();
        System.out.println((mm.getTableName(1)));
        int field_count=mm.getColumnCount();
        System.out.println("number of column n: "+field_count);
        for(int i=1;i<=field_count;i++){
            System.out.println(mm.getColumnName(i)+".............."+mm.getColumnType(i));
        }

    }
}
