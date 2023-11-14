// #5
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecords {
    public void update() {
        try {
            String URl = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);
            // Update record of table
            String query = "update personal set mobile=? where rollno=?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setLong(1, 6239522303L);
            pstm.setInt(2, 1);

            int res = pstm.executeUpdate();
            System.out.println(" Update Successfully .Total Affected = " + res);
            // close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
