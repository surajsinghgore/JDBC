
// #5

package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    public void readData() {
        try {
            String URl = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);
            // select record of table
            String query = "select * from personal";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            System.out.println("read Data ");
            // ! way 1 multi line
            while (rs.next()) {
                System.out.println("rollno = " + rs.getInt(1));
                System.out.println("name = " + rs.getString(2));
                System.out.println("email = " + rs.getString(3));
                System.out.println("mobile = " + rs.getLong(4));
                System.out.println("class = " + rs.getString(5));
            }

            // ! way2 single line
            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("sname");
                String email = rs.getString("email");
                long mobile = rs.getLong("mobile");
                String className = rs.getString("class");

                System.out.println(rollno + " " + name + " " + email + " " + mobile + " " + className);

            }

            // close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
