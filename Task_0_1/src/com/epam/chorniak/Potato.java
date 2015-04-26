package com.epam.chorniak;

public class Potato extends Vegetables {
	
	private String color;

	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color == null || color == "" || color == " ")
			System.out.println("color is incorrect");
		else 
		this.color = color;
	}
	
	
	public Potato(int calorii, int price, String color, int weight) {
		super(calorii, price, weight);
		this.color = color;
		
	}
	public Potato(){
		
	}
	
	@Override
	public String toString() {
		return "Potato [color=" + color + ", calorii=" + calorii + ", price="
				+ price + ", weight=" + weight + "]";
	}
	
	

}
