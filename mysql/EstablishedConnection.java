package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishedConnection {
    public void establishedConnection() {
        try {
            // ! to get PORT of MYSQL type ⌨️ select @@port; in sql
            String URl = "jdbc:mysql://localhost:3306";
            String username = "root";
            // ! to get username of MYSQL type ⌨️ select user(); in sql
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);

            System.out.println("Successfully Established Connection With Database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
