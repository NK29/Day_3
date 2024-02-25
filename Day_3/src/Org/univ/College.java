package Org.univ;

public class College extends University{
	
	public void ug() {
		System.out.println("UG: Tamil");
	}
	public void pg() {
		System.out.println("PG: Telugu");
	}

	public static void main(String[] args) {
		// ParentClass ref = new ChildClass();
		University university = new College();
		university.ug();
		university.pg();
	}

}
