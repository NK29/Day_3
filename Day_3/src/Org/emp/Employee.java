package Org.emp;

public class Employee {
	
	public void empId(Name office) {
		System.out.println("naveen");
	}
	public void empId(Email office) {
		System.out.println("naveen@wisseninfo.com");
	}

	public static void main(String[] args) {
	//ClassName objName = new ClassName();
		Employee employee = new Employee();
		
		Name name = new Name();
		employee.empId(name);
		
		Email email = new Email();
		//Class-ObjName.method(ObjName);
		employee.empId(email);

	}

}
