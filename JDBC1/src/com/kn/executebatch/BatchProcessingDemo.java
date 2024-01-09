package com.kn.executebatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessingDemo {
	
	private static final String URL="jdbc:mysql://localhost:3306/jdbc";
	private static final String USER_NAME="root";
	private static final String PASSWORD="root";
	
	private static final String INSERT_USERS="insert into user values(?,?);";
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Connection con=null;

		try {
//			Load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Establish connection using driver manager
			con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
//			Create preservedStatement
			PreparedStatement pstmt=con.prepareStatement(INSERT_USERS);
			
//			Take input from user
			System.out.println("Enter the number of users:");
			int count=scan.nextInt();
			for(int i=1;i<=count;i++) {
				System.out.println("Enter the id = ");
				int id=scan.nextInt();
				System.out.println("Enter the password = ");
				String password=scan.next();
				pstmt.setInt(1, id);
				pstmt.setString(2, password);
				pstmt.addBatch();
			}
			
//			Send and execute query using executeBatch()
			pstmt.executeBatch();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(scan!=null) {
				scan.close();
			}
		}
		
	}

}
