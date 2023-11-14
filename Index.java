import mysql.*;

public class Index {
    public static void main(String[] args) {
        // ! Established Connection With Database
        // EstablishedConnection obj1 = new EstablishedConnection();
        // obj1.establishedConnection();
        // ! create database in mysql
        // CreateDatabase obj2 = new CreateDatabase();
        // obj2.createDB();
        // ! CreateTable obj3=new CreateTable();
        // ? way 1 using statement
        // obj3.createTable();
        InsertRecord obj4 = new InsertRecord();
        // obj4.usingStatement();
        // ? way 2 using preparedStatement

        obj4.usingPreparedStatement();
    }
}
