package Org.add;

public class GreenTech {
	
	public void greenOmr(Order pizza) {
		System.out.println("Order pizza  : home marker");
	}
	public void greenOmr(Type Int) {
		System.out.println("Type Int     : 123456");
	}
	public void greenOmr(Number three) {
		System.out.println("Number three : 29");
	}

	public static void main(String[] args) {
		
		GreenTech greentech = new GreenTech();
		
		Order order = new Order();
		greentech.greenOmr(order);
		
		Type type = new Type();
		greentech.greenOmr(type);
		
		Number number = new Number();
		greentech.greenOmr(number);
	}

}