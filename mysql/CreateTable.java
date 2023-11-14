// #3
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public void createTable() {
        try {
            String URl = "jdbc:mysql://localhost:3306/";
            // must provide database name
            String dbName = "student";
            // or "jdbc:mysql://localhost:3306/student"
            String username = "root";
            String password = "Suraj@3224";
            Connection con = DriverManager.getConnection(URl + dbName, username, password);
            // create table command
            String query = "create table personal(rollNo int primary key, sname varchar(20) not null,email varchar(30) unique,mobile bigInt(10) unique,class varchar(15))";
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            System.out.println("Successfully Table Created In Database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}