package week3.day2;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {

		AxisBank ax = new AxisBank();
		ax.deposit();
		ax.saving();
		ax.fixed();
	}
	
	public void deposit() {
		
		System.out.println("Deposit in Child bank");
		
	}

}
