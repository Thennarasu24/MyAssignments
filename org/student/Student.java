package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentID();
		stu.studentName();
	}
	
	public void studentName() {
		System.out.println("Student name is Thennarasu");
	}
	
	public void studentDept() {
		System.out.println("Student Department is Civil");
	}
	
	public void studentID() {
		System.out.println("Student name is 1234567");
	}
	

}
