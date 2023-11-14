package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
            System.out.println("read Update Succeessfully .Total Affected = " + res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
