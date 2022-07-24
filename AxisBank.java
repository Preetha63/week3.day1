package week3.day1.assignments;

public class AxisBank {
	
	public void deposit() {
		System.out.println("OVERRIDING FOR DEPOST Rs.200");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank= new AxisBank();
		bank.deposit();

	}

}
