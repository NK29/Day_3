package Org.company;

public class CompanyInfo {
	
	public void companyName(Address one) {
		System.out.println("whitefied");
	}

	public static void main(String[] args) {
		
		CompanyInfo companyinfo = new CompanyInfo();
		
		Address address = new Address();
		companyinfo.companyName(address);
	}

}
