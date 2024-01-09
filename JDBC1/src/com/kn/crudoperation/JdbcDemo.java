package com.kn.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	
	private static final String URL="jdbc:mysql://localhost:3306/jdbc";
	private static final String USER_NAME="root";
	private static final String USER_PASSWORD="root";
	
	
	private static final String CREATE_EMPLOYEE="create table employee(id int, name varchar(20), salary int);";
	
	private static final String INSERT_EMPLOYEE1="insert into employee values(1,'karthik',700000);";
	private static final String INSERT_EMPLOYEE2="insert into employee values(2,'kiran',560000);";
	private static final String INSERT_EMPLOYEE3="insert into employee values(3,'shashi',350000);";
	private static final String INSERT_EMPLOYEE4="insert into employee values(4,'santhsh',670000);";
	private static final String INSERT_EMPLOYEE5="insert into employee values(5,'chethan',870000);";
	
	private static final String UPDATE_EMPLOYEE="update employee set name='santhosh' where id =4;" ;
	
	private static final String DELETE_EMPLOYEE="delete from employee where id =5;";
	
	private static final String SELECT_EMPLOYEES="select * from employee;";
	

	
	
	public static void main(String[] args) {
		Connection con=null;
		
		try {
//			1. Load and register driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
//			2. Establish connection using DriverManager
			
			con=DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
			System.out.println("Connection established = "+con.toString());
			
			
//			3. Create statement object
			
			Statement stmt = con.createStatement();
			
			
//			4. Send and execute query
			
			
//			-----------> Create query <---------
//			boolean flag = stmt.execute(CREATE_EMPLOYEE);
//			if(flag) {
//				System.out.println("Employee table created successfully");
//			}

			
//			-----------> Insert query  <-----------
//			int count=0;
//			count=stmt.executeUpdate(INSERT_EMPLOYEE1);
//			System.out.println(count+" new record inserted.");
//			
//			count=stmt.executeUpdate(INSERT_EMPLOYEE2);
//			System.out.println(count+" new record inserted.");
//			
//			count=stmt.executeUpdate(INSERT_EMPLOYEE3);
//			System.out.println(count+" new record inserted.");
//			
//			count=stmt.executeUpdate(INSERT_EMPLOYEE4);
//			System.out.println(count+" new record inserted.");
//			
//			count=stmt.executeUpdate(INSERT_EMPLOYEE5);
//			System.out.println(count+" new record inserted.");
			
			
//			-------> Update query <-----
//			int count=0;
//			count =stmt.executeUpdate(UPDATE_EMPLOYEE);
//			System.out.println(count+" rows affected");
			
			
//			--------> Delete query <------
//			int count=0;
//			count = stmt.executeUpdate(DELETE_EMPLOYEE);
//			System.out.println(count+" rows affected");
			
			
//			5. process the ResultSet to get data
			
//			--------> Select query <-------
			ResultSet rs= stmt.executeQuery(SELECT_EMPLOYEES);
			System.out.println("********Employee table records********");
			while(rs.next()) {
				System.out.println("ID = "+rs.getInt(1)+", NAME = "+rs.getString(2)+", SALARY = "+rs.getInt(3));
			}
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Failed to establish connection");
		}
		finally {
			
//			6. Close connection
			try {
				if(con!=null) {
					con.close();
					System.out.println("Connection closed successfully!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
