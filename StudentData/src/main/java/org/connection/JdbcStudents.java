package org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcStudents  {
	static Connection con;
	
	public static Connection getcon() {
		
		
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 try {
				 
				con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Mysqldatabase123");
				
				return con;
			} 
			 
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
			 
			return null;
		
		
		

	}
	
//	public static void main(String[] args) throws SQLException {
//		System.out.println("hi");
//		getconnection();
//		System.out.println(getconnection());
//	}
	
	

}
