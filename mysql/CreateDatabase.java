// #2
package mysql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDatabase {
    public void createDB() {
        try {

            String URl = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl, username, password);
            // ! Write db create query
            String query = "create database student";
            // execute statement
            // 1.execute() ---> use to perform all operation, TRUE-> ResultSet False->Not
            // ResultSet
            // 2.executeQuery() ---> use to perform DML command (Insert,Update,Delete),
            // return int value
            // 3.executeUpdate() ---> retrieve data from database , return ResultSet , Error
            // if no ResultSet receive
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            System.out.println("Successfully Established Connection With Database");
            // close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
