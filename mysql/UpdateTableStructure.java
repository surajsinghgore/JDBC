// #6
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTableStructure {
    public void updateTableStructure() {
        try {
            String URl = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);
            // update table structure
            String query = "ALTER TABLE personal RENAME COLUMN sname TO name";
            Statement stm = con.createStatement();
            stm.executeUpdate(query);

            System.out.println(" Table Structure update successfully ");
            // close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
