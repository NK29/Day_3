package Org.edu;

public class Arts extends Education{
	
	public void bsc() {
		System.out.println("BSC: Maths");
	}
	public void bed() {
		System.out.println("BSC: Tamil");
	}
	public void ba() {
		System.out.println("BA: Telugu");
	}
	public void bba() {
		System.out.println("BBA: finance");
	}
	public void ug() {
		System.out.println("UG: kannada");
	}
	public void pg() {
		System.out.println("PG: Hindi");
	}
	
	public static void main(String[] args) {
		// ParentClass ref = new ChildClass();
		Education education = new Arts();
		education.ug();
		education.pg();
	}

}
