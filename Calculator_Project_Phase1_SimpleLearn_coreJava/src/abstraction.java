
public abstract class abstraction {
	int price;
	String model;
	public abstraction() {
		
	}
	public abstraction(String s, int i) {
		this.model=s;
		this.price=i;
	}
	public abstract void pressEnter();
	public void pressJ() {
		System.out.println("key j is entered");
	}

}
