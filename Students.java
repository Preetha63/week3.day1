package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo() {
		
	}
	
	public void getStudentInfo(int studentID) {
		System.out.println("Student id:"+studentID);
	}
	
	public void getStudentInfo(int studentID, String name ) {
		System.out.println("Student id & Name:"+studentID+" " +name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student E-mail & Phone number:"+email +" "+phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students info = new Students();
		info.getStudentInfo();
		info.getStudentInfo(566770);
		info.getStudentInfo(566770, "preetha");
		info.getStudentInfo("tpreeth63@gmail.com", 9597631007L);
		
		
		

	}

}
