package week3.day1.org.student;


import week3.day1.org.department.Department;

public class Student extends Department {

	public void studentName() {

		System.out.println("Student name is preetha");
	}

	public void studentDept() {

		System.out.println("Student Department is Computer science");

	}

	public void studentId() {

		System.out.println("Student id is 121");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();

	}



}


