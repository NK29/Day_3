package Inheritance;

public class Desktop implements Software, Hardware {
	
	//Override
	public void HardwareResource() {
	System.out.println("Employee is IT");
	}
	//Override
	public void SoftwareResource() {
	System.out.println("company is wissen");
	}

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		desktop.HardwareResource();
		desktop.SoftwareResource();
	}

}
