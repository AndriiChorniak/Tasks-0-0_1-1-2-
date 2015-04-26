package com.epam.chorniak;



public abstract class Vegetables implements Comparable<Vegetables> {
	protected int calorii;
	protected int price;
	protected int weight;

	public int getCalorii() {
		return calorii;
	}

	public void setCalorii(int calorii) {
		if (calorii > 0)
			this.calorii = calorii;
		else
			System.out.println("input correct value of calorii");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0)
			this.price = price;
		else
			System.out.println("input correct value of price");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0)
			this.weight = weight;
		else
			System.out.println("input correct value of weight");
	}

	public Vegetables(int calorii, int price, int weight) {
		super();
		if (calorii > 0)
			this.calorii = calorii;
		if (price > 0)
			this.price = price;
		if (weight > 0)
			this.weight = weight;
	}

	public Vegetables() {

	}

	@Override
	public String toString() {
		return "Vegetables [calorii=" + calorii + ", price=" + price
				+ ", weight=" + weight + "]";
	}

	@ Override
	public int compareTo(Vegetables v) {
		/*int returnValue = 0;
		if (this.getPrice() < v.getPrice())
			returnValue = -1;
		else if (this.getPrice() > v.getPrice())
			returnValue = 1;
		else if (this.getPrice() == v.getPrice())
			returnValue = 0;*/
		return new Integer(this.getPrice()).compareTo(new Integer(v.getPrice()));
		
		
	}
	
	

}
