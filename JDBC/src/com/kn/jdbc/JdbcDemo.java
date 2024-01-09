package com.kn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDemo {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/JDBC";
		String user="root";
		String password="root";
		Connection con=null;
		
		String createUser="create table user(id int,password varchar(20));";
		String insertUser1="insert into user values(1,'Raju@123');";
		String insertUser2="insert into user values(2,'punith@123');";
		String insertUser3="insert into user values(3,'venkatesh@123');";
		String insertUser4="insert into user values(4,'adithya@123');";
		
		try {
			
//			1. Load and register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Driver registered successfully..");
		    
//		    2. Establish connection using DriverManager
			con= DriverManager.getConnection(url, user, password);
			System.out.println("Connection Established = "+con);
			
//			3. Create Statement Object
		    Statement stmt= con.createStatement();
		    
			
//			4. Send and execute query
		    
//		    stmt.execute(createUser);
//		    System.out.println("**User table created...");
			
		    int count=stmt.executeUpdate(insertUser1);
		    System.out.println(count+" new record inserted successfully!!");
		    count=stmt.executeUpdate(insertUser2);
		    System.out.println(count+" new record inserted successfully!!");
		    count=stmt.executeUpdate(insertUser3);
		    System.out.println(count+" new record inserted successfully!!");
		    count=stmt.executeUpdate(insertUser4);
		    System.out.println(count+" new record inserted successfully!!");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("----> Driver is not registered!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("----> Connection failed!");
		}finally {
			
//			5. Close connection 
			try {
				con.close();
				System.out.println("----> Connection closed successfully!");
			} catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("----> Connection is not closed!");
			}
		}
	}

}
