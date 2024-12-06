package jdbc;
import java.sql.*;
public class practice {//Java program to implement a simple JDBC application

    public static void display() throws ClassNotFoundException, SQLException {
        // Load driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        ;

        // Obtain a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "");

        // Obtain a statement
//            Statement st = con.createStatement();
//            ResultSet rs=st.executeQuery("select * from empinfo");
//

        PreparedStatement rst = con.prepareStatement("insert into info values (?,?,?,?)");
        rst.setString(1, "laaaaa");
        rst.setInt(2, 1000);
        rst.setInt(3, 1000000);
        rst.setString(4, "lalalal");
        rst.addBatch();
        rst.executeUpdate();
        ResultSet rs = rst.executeQuery("select * from info");
//            while (rst.wait()){}
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t " + rs.getInt(2) + "\t  " + "\t  " + rs.getString(3) + "\t  " + rs.getInt(4));
            break;
        }
        ;


    }

    public static void main(String args[])
            throws SQLException, ClassNotFoundException {
        display();
//            String driverClassName
//                    = "com.mysql.cj.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306/emp";
//            String username = "scott";


    }
}
    // class


