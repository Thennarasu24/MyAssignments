package week3.day2;

public class Student {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.getStudentInfo(123456);
		stu.getStudentInfo(123456, "Thennarasu");
		stu.getStudentInfo("thenn@gmail.com", 98765432);
		}
	
	public void getStudentInfo(int id) {
		System.out.println("ID is " +id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("ID is " +id +" & Name is " +name);
	}
	
	public void getStudentInfo(String email, int phonenum) {
		System.out.println("Email is " +email +" & PhoneNum is " +phonenum);
	}

}
