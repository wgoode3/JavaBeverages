package Abstracts;

public abstract class Drink {
	private String color;
	private Integer temperature;
	private Integer volume;
	
	public Drink(String color, Integer temperature, Integer volume) {
		this.color = color;
		this.temperature = temperature;
		this.volume = volume;
	}
	
	public Drink() {
	}
	
	public void consume() {
		if(this.temperature > 70) {
			System.out.println("Sip sip...");
			this.volume = (int) (this.volume * 0.9);
		} else {
			System.out.println("Glug glug...");
			this.volume = (int) (this.volume * 0.75);
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}
}
