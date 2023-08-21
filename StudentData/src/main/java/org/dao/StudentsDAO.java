package org.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.bean.Studentsbean;
import org.connection.JdbcStudents;

public class StudentsDAO {

 

	public void insertStudent(Studentsbean stdbean) throws SQLException  {
		
		
		
		String sqlquery = "insert into studentsdetails values (?,?,?)";

		try {
			PreparedStatement ps = JdbcStudents.getcon().prepareStatement(sqlquery);
			System.out.println(ps);

			ps.setInt(1, stdbean.getRollNo());
			
			ps.setString(2, stdbean.getName());
			ps.setInt(3, stdbean.getMarks());

		  ps.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("failed");
		}
		
		
		
		




	}


	public boolean deleteStudent(int rollNo ) {

		String sqlquery = "delete from studentsdetails where rollNo=?";

		try {
			PreparedStatement ps = JdbcStudents.getcon().prepareStatement(sqlquery);

			ps.setInt(1,rollNo);

			return ps.executeUpdate()>0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return false;



	}


	public boolean updateStudents( int rollNo, int marks) {
		System.out.println(rollNo);

		String sqlquery = "update studentsdetails set marks=? where rollNo=?";

		try {
			PreparedStatement ps = JdbcStudents.getcon().prepareStatement(sqlquery);

			ps.setInt(1,marks);
			ps.setInt(2,rollNo);

			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return false;

	}

	public Studentsbean getstudent(int rollno) {
		String sql ="select rollno, studentname, marks from studentsdetails where rollno =?"; 

		try {
			PreparedStatement ps = JdbcStudents.getcon().prepareStatement(sql); 
			ps.setInt(1, rollno);

			ResultSet rs = ps.executeQuery(); 


			if(rs.next()) {

				Studentsbean std = new Studentsbean();
				std.setRollNo(rs.getInt(1));
				std.setName(rs.getString(2));
				std.setMarks(rs.getInt(3));


				return std; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null; 
	}

	public List<Studentsbean> getStudents(){

		List<Studentsbean> list=null;

		try {
			list = new ArrayList<Studentsbean>(); 
			String sql ="select rollno, studentname, marks from studentsdetails"; 
			PreparedStatement ps = JdbcStudents.getcon().prepareStatement(sql); 
			ResultSet rs = ps.executeQuery(); 

			while(rs.next()) {

				Studentsbean std = new Studentsbean(); 
				std.setRollNo(rs.getInt(1));
				std.setName(rs.getString(2));

				std.setMarks(rs.getInt(3));


				list.add(std); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list; 
	}








}
