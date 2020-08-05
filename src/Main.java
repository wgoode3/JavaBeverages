import Abstracts.Drink;
import Interfaces.ICaffeinated;
import Models.Coffee;
import Models.Water;

public class Main {
	public static void main(String[] args) {		
		Drink d1 = new Water("clear", 85, 250);
		d1.consume();
		d1.setTemperature(55);
		d1.consume();
		System.out.println(d1.getVolume());
		Coffee c1 = new Coffee("black", 4, 284, "arabica", false, false);
		Coffee c2 = new Coffee("brown", 88, 500, "another type", true, true);
		c1.consume();
		System.out.println(c1.getIsSweetened());
		Drink[] menu = new Drink[] {d1, c1, c2};
		ICaffeinated[] coffeeMachineMenu = new ICaffeinated[] {c1, c2};
	}
}
