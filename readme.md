
# JDBC WITH JAVA AND MYSQL

This project allow to perform all database operations using java and mysql 


## Setup Need To Done In PC Before JDBC

✅Download Latest Java JDK Version

visit official website
```bash
  https://www.oracle.com/java/technologies/downloads
```
Set Environment variable\
 1.Open Environment variable Setting\
   2. Inside path variable add JDK Path
   ```bash
C:\Program Files\Java\jdk-21\bin   
```

3.Run the below command to check whether JDK Install Or Not
 ```bash
javac -version  
```
![App Screenshot](https://res.cloudinary.com/dnxv21hr0/image/upload/v1699957498/jdbc/z5d8kbm27efrkayx9kxn.png)

✅Download Latest MySQL

visit official website
```bash
 https://www.mysql.com/downloads
```
Install Installer

![App Screenshot](https://res.cloudinary.com/dnxv21hr0/image/upload/v1699958200/jdbc/uxwdnf6hwfiko45vgzck.png)

✅Download Latest MYSQL CONNECTOR
 ```bash
https://www.mysql.com/products/connector
```
1.Extract Jar File from the connector zip file\
2.Paste Jar Files in any location

![App Screenshot](https://res.cloudinary.com/dnxv21hr0/image/upload/v1699958463/jdbc/fvx0kwrbpasnhkwswbqz.png)

3.Now set jar file in classpath Environment variable

 ```bash
classpath = C:\mysqlConnector\mysql-connector-j-8.2.0.jar
```

✅Now add Jar file with your Inside

For vscode create any java file and add Connector Jar file in referenced Libraries

![App Screenshot](https://res.cloudinary.com/dnxv21hr0/image/upload/v1699958684/jdbc/gsrcagiz5tjkjmrgxske.png)




## Tech Stack

Java , MYSQL



## Important method

#### statement execute methods


| Method | Return Val     | Description                |
| :-------- | :------- | :------------------------- |
| `execute()` | ***true*** => ResultSet ***false*** => Not ResultSet | use to perform all operation |
| `executeQuery()` | ***int value***. 1 record affected|use to perform DML command (Insert,Update,Delete) |
| `executeUpdate()` | ***ResultSet***, Error if no ResultSet return| retrieve data from database |




## Programs

1.Create Database\
2.Create Table\
3.Insert Record\
4.Read Record\
5.Update Record\
6.Delete Record\
7.Update Table Structure


## Authors

- [@surajsingh](https://www.linkedin.com/in/surajsinghgore)

