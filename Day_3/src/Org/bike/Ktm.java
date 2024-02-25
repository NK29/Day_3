package Org.bike;

public class Ktm implements Bike{
	
	public void cost() {
		System.out.println("Cost: 50");
	}
	public void speed() {
		System.out.println("Speed: 35");
	}

	public static void main(String[] args) {
		// ParentClass ref = new ChildClass();
		Bike Bike = new Ktm();
		Bike.cost();
		Bike.speed();


	}

}
