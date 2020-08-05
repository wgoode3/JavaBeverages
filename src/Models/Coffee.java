package Models;

import Abstracts.Drink;
//import Interfaces.IAlcoholic;
import Interfaces.ICaffeinated;

public class Coffee extends Drink implements ICaffeinated {
	
	private String beans;
	private Boolean isSweetened;
	private Boolean hasCream;
	
	public Coffee(String color, Integer temperature, Integer volume, String beans, Boolean isSweetened, Boolean hasCream) {
		super(color, temperature, volume);
		this.beans = beans;
		this.isSweetened = isSweetened;
		this.hasCream = hasCream;
	}

	public String getBeans() {
		return beans;
	}

	public void setBeans(String beans) {
		this.beans = beans;
	}

	public Boolean getIsSweetened() {
		return isSweetened;
	}

	public void setIsSweetened(Boolean isSweetened) {
		this.isSweetened = isSweetened;
	}

	public Boolean getHasCream() {
		return hasCream;
	}

	public void setHasCream(Boolean hasCream) {
		this.hasCream = hasCream;
	}
	
	
}
