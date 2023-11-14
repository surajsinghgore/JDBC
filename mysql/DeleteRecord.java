// #6
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
      public void delete() {
        try {
            String URl = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);
            // Delete record of table
            String query = "delete from personal where rollno=1";
            
Statement stm=con.createStatement();
       int res=stm.executeUpdate(query);
            System.out.println("Delete Successfully .Total Affected = " + res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
