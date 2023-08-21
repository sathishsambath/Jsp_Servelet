package org.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnect {
	
	public static void main(String[] args) throws SQLException {
		JdbcConnect con = new JdbcConnect();
		con.prepsts();
	}

//private void connect() throws SQLException {
//	// TODO Auto-generated method stub
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Mysqldatabase123");
//	String query = "insert into studentsdetails values (1000,'vinod',233)";
//	Statement st = con.createStatement();
//	st.executeUpdate(query);
//	System.out.println(con);
//	
//
//}

private void prepsts()throws SQLException {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Mysqldatabase123");
	String query = "insert into studentsdetails values (?,?,?)";
	PreparedStatement ps = con.prepareStatement(query);
	ps.setInt(1, 200);
	ps.setString(2, "j");
	ps.setInt(3, 300);
	ps.executeUpdate();
	con.close();
	
	

}


	
	
	
	
	
	



}
