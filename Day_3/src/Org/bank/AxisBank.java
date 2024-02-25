package Org.bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit account: 650");
	}

	public static void main(String[] args) {
		//ParentClass ref = new ChildClass();
		BankInfo bankinfo = new AxisBank();
		bankinfo.saving();
		bankinfo.fixed();
		bankinfo.deposit();
	}

}
