package com.epam.chorniak;

public abstract class Car {
	protected int price;
	protected String name;

	public Car(int price, String name) {
		super();
		if (price > 0)
			this.price = price;
		else
			System.out.println("input correct price");
		if (name == null || name == "" || name == " ")
			System.out.println("input correct name");
		else
			this.name = name;
	}

	public Car() {
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0)
			this.price = price;
		else
			System.out.println("input correct value");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name == "" || name == " ")
			System.out.println("input correct name");
		else
			this.name = name;
	}

	public String toString() {
		return "Car [price=" + price + ", name=" + name + "]";
	}

}
