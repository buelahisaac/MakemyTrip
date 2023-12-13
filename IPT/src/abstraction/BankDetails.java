package abstraction;

public class BankDetails extends Bank{
	@Override
	public void personalLoan() {
		System.out.println("14.5%");
		
	}
	public static void main(String[] args) {
		BankDetails v=new BankDetails();
		v.personalLoan();
		v.educationalLoan();
		v.homeLoan();
	}

}
