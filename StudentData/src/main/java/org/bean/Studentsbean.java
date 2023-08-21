package org.bean;

public class Studentsbean {
	int rollNo;
	String name;
	int marks;
	
	public Studentsbean() {
		
	}
	
	
	public Studentsbean(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		
	}
	
	
	
	public int getRollNo() {
		System.out.println(rollNo);
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		//System.out.println(rollNo);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//System.out.println(name);
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
		//System.out.println(marks);
	}
	
	
	@Override
	public String toString() {
		return "Studentsbean [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	

}
