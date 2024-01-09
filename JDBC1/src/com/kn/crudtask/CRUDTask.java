package com.kn.crudtask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDTask {
	
	public static final String URL="jdbc:mysql://localhost:3306/jdbc";
	public static final String USER_NAME="root";
	public static final String USER_PASSWORDD="root";
	
	public static final String CREATE_PRODUCT="create table product(id int,name varchar(20),cost int);";
	
	public static final String INSERT_PRODUCT1="insert into product values(1,'soap',30);";
	public static final String INSERT_PRODUCT2="insert into product values(2,'television',30000);";
	public static final String INSERT_PRODUCT3="insert into product values(3,'phone',20000);";
	public static final String INSERT_PRODUCT4="insert into product values(4,'shoe',3000);";
	public static final String INSERT_PRODUCT5="insert into product values(5,'paste',100);";
	
	public static final String UPDATE_PRODUCT2="update product set cost=20 where id=2";
	public static final String UPDATE_PRODUCT3="update product set cost=40000 where id=3";
	
	public static final String DELETE_PRODUCT="delete from product where id=5";
	
	public static final String SELECT_PRODUCTS="select * from product";
	

	public static void main(String[] args) {
		
		Connection con=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(URL, USER_NAME, USER_PASSWORDD);
			System.out.println("Connection established successfully");
			
			Statement stmt= con.createStatement();
			
			
			
//			boolean flag=stmt.execute(CREATE_PRODUCT);
//			if(flag) {
//				System.out.println("Product table created successfully");
//			}
			
			
//			int count=0;
//			count=stmt.executeUpdate(INSERT_PRODUCT1);
//			System.out.println(count+" new record inserted.");
//			count=stmt.executeUpdate(INSERT_PRODUCT2);
//			System.out.println(count+" new record inserted.");
//			count=stmt.executeUpdate(INSERT_PRODUCT3);
//			System.out.println(count+" new record inserted.");
//			count=stmt.executeUpdate(INSERT_PRODUCT4);
//			System.out.println(count+" new record inserted.");
//			count=stmt.executeUpdate(INSERT_PRODUCT5);
//			System.out.println(count+" new record inserted.");
			
			
//			int count=0;
//			count=stmt.executeUpdate(UPDATE_PRODUCT2);
//			System.out.println(count+" rows affected");
//			count=stmt.executeUpdate(UPDATE_PRODUCT3);
//			System.out.println(count+" rows affected");
			
			
			int count=0;
			count=stmt.executeUpdate(DELETE_PRODUCT);
			System.out.println(count+" rows affected");
			
			
			ResultSet rs=stmt.executeQuery(SELECT_PRODUCTS);
			while(rs.next()) {
				System.out.println("ID = "+rs.getInt(1)+", Name = "+rs.getString(2)+", Cost = "+rs.getInt(3));
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
					System.out.println("Connection closed successfully!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
