package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertRecord {
    // way 1
    public void usingStatement() {
        try {
            String URl = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);
            // insert record in table command
            String query = "insert into personal(rollNo, sname,email,mobile,class) values(1,'suraj singh','suraj@gmail.com',69785674857,'bca-5')";
            Statement stm = con.createStatement();
            stm.execute(query);
            System.out.println("Record successfully inserted in table");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ! or
    // way 2
    public void usingPreparedStatement() {
        try {
            String URl = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);
            // insert record in table command
            String query = "insert into personal values(?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, 2);
            pstm.setString(2, "shubham");
            pstm.setString(3, "shubhi@gmail.com");
            pstm.setLong(4, 8674657904L);
            pstm.setString(5, "ba-5");
            pstm.execute();
            System.out.println("Record successfully inserted using prepared Statement in table");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
