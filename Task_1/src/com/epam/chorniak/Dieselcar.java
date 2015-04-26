package com.epam.chorniak;

public class Dieselcar extends Car {
	private int volumeOfEngine;
	private static int count = 0;
	private static double resultPrice = 0.0;

	public int getVolumeOfEngine() {
		return volumeOfEngine;
	}

	public void setVolumeOfEngine(int volumeOfEngine) {
		if (volumeOfEngine > 0)
			this.volumeOfEngine = volumeOfEngine;
		else
			System.out.println("input correct value");
	}

	public Dieselcar(int price, String name, int volumeOfEngine) {
		super(price, name);
		if (volumeOfEngine > 0)
		this.volumeOfEngine = volumeOfEngine;
		else System.out.println("input correct value of volumeOfEngine");
		count++;
		resultPrice += price;
		
	}
	public Dieselcar(){}
	
	public static void averagePrice(){
		double averagePrice = resultPrice /count;
		System.out.println("Average price of Dieselcar is "+ averagePrice);
	}

	public String toString() {
		return "Dieselcar [volumeOfEngine=" + volumeOfEngine + ", price="
				+ price + ", name=" + name + "]";
	}
	
	
	

}
