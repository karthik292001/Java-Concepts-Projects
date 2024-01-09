package com.kn.crudoperations2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class CrudOperationsDemo {
	
	private static final String URL="jdbc:mysql://localhost:3306/jdbc";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	
	private static final String CREATE_TABLE="create table product(id int,name varchar(20),price decimal);";
	private static final String INSERT_RECORDD="insert into product values(?,?,?);";
	private static final String UPDATE_RECORD="update product set name=?, price=? where id=?;";
	private static final String DELETE_RECORD="delete from product where id=?";
	private static final String SELECT_RECORD="select * from product where id=?";

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Choose a option to process further:");
		System.out.println("1.press 1 to create new table");
		System.out.println("2.Press 2 to insert to new product");
		System.out.println("3.Press 3 to update existing product");
		System.out.println("4.Press 4 to delete existing product");
		System.out.println("5.Press 5 to fetch products");
		System.out.println("6.Press 6 to exit from process");
		
		Connection con=null;
		int count=0;
		
		try {
			
//			1.Load and register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver registered successfully");
			
//			2.Establish connection using Driver manager
			con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
//			System.out.println("Connection established successfully");
			
//			3.Create prepared statement
			
			
			while(true) {
				System.out.println("Enter a choice:");
				int choice = scan.nextInt();
				switch(choice) {
					
					case 1:
						PreparedStatement pstmt1=con.prepareStatement(CREATE_TABLE);
						boolean result=pstmt1.execute();
						if(!result) {
							System.out.println("Table created successfully!");
						}
						System.out.println("~~~~*~~~~");
						break;
						
						
					case 2:
						PreparedStatement pstmt2=con.prepareStatement(INSERT_RECORDD);
						System.out.println("Enter a product ID:");
						int id=scan.nextInt();
						
						System.out.println("Enter a product name:");
						String name=scan.next();
						
						System.out.println("Enter a product price");
						double price=scan.nextDouble();
						
						pstmt2.setInt(1, id);
						pstmt2.setString(2, name);
						pstmt2.setDouble(3, price);
						
						count=pstmt2.executeUpdate();
						
						System.out.println(count+" new product inserted successfully!");
						System.out.println("~~~~*~~~~");
						break;
					
					case 3:
						
						PreparedStatement pstmt3= con.prepareStatement(UPDATE_RECORD);
						System.out.println("Enter a product ");
						int id1=scan.nextInt();
						System.out.println("Enter a product name:");
						String name1=scan.next();
						System.out.println("Enter a product price");
						double price1=scan.nextDouble();
						
						pstmt3.setString(1, name1);  // (name,price,id) Sequence of variables must 
						pstmt3.setDouble(2, price1); // match with query(update) written.
						pstmt3.setInt(3, id1);
						
						count=pstmt3.executeUpdate();
						System.out.println(count+" product updated successfully");
						System.out.println("~~~~*~~~~");
						break;
						
						
					case 4:
						PreparedStatement pstmt4=con.prepareStatement(DELETE_RECORD);
						
						System.out.println("Enter a product ID:");
						int product_id=scan.nextInt();
						
						pstmt4.setInt(1, product_id);
						count=pstmt4.executeUpdate();
						
						System.out.println(count+" product deleted successfully!");
						System.out.println("~~~~*~~~~");
						break;
						
						
					case 5:
						PreparedStatement pstmt5=con.prepareStatement(SELECT_RECORD);
						
						System.out.println("Entet a product ID:");
						int product_id2=scan.nextInt();
						
						pstmt5.setInt(1, product_id2);
						ResultSet rs=pstmt5.executeQuery();
						
						System.out.println("*****Product detials*****");
						while(rs.next()) {
							System.out.println("ID = "+rs.getInt(1));
							System.out.println("Name = "+rs.getString(2));
							System.out.println("Price = "+rs.getDouble(3));
							System.out.println("~~~~*~~~~");
						}
						break;
						
					case 6:
						return ;
					default:
						System.out.println("Invalid input, Try with valid option!");
						break;
					
				}
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) {
					con.close();
					System.out.println("-------->Connection closed successfully<---------");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	
		
		
	}

}
