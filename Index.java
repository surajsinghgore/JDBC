import mysql.CreateDatabase;
import mysql.CreateTable;
import mysql.EstablishedConnection;

public class Index {
    public static void main(String[] args) {
        // Established Connection With Database
        // EstablishedConnection obj1 = new EstablishedConnection();
        // obj1.establishedConnection();
        // create database in mysql
        // CreateDatabase obj2 = new CreateDatabase();
        // obj2.createDB();
        CreateTable obj3=new CreateTable();
        obj3.createTable();
    }
}
