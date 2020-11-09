
public class EatCake {

	public EatCake() {
		//empty constructor
	}
	
	public static void eatCake(Cake cake) {
		if(! cake.isEmpty()) {
			cake.takeABite();
			eatCake(cake);
		}
	}
	
	public static void main(String[] args) {
		Cake cake = new Cake();
		eatCake(cake);
		System.out.println("Done eating cake, now back to JAVA 2!");
	}

}
