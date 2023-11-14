// #1
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishedConnection {
    public void establishedConnection() {
        try {
            // ! to get PORT of MYSQL type ⌨️ select @@port; in mysql
            String URl = "jdbc:mysql://localhost:3306";
            String username = "root";
            // ! to get username of MYSQL type ⌨️ select user(); in mysql
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);

            System.out.println("Database Successfully Created In MYSQL");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
