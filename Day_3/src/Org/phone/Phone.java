package Org.phone;

public class Phone {
	
	public void phoneInfo(Detail pizza) {
		System.out.println("Oneplus Nord 2");
	}

	public static void main(String[] args) {
		//ClassName ObjName = new ClassName();
		Phone phone = new Phone();
		//ClassName ObjName = new ClassName();
		Detail detail = new Detail();
		//Class-ObjName.method(ObjName);
		phone.phoneInfo(detail);
	}

}
