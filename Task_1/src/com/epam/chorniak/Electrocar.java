package com.epam.chorniak;

public class Electrocar extends Car {
	private int battery;
	private static int count = 0;
	private static double resultPrice = 0.0;

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		if (battery > 0)
			this.battery = battery;
		else
			System.out.println("input correct value");
	}

	public Electrocar(int price, String name, int battery) {
		super(price, name);
		if (battery > 0)
			this.battery = battery;
		else
			System.out.println("input correct value of battery");
		count++;
		resultPrice += price;
		
	}
	public Electrocar(){}
	
	public static void averagePrice(){
		double averagePrice = resultPrice /count;
		System.out.println("Average price of Electrocar is "+ averagePrice);
	}

	public String toString() {
		return "Electrocar [battery=" + battery + ", price=" + price
				+ ", name=" + name + "]";
	}
	
	

}
