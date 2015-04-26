package com.epam.chorniak;

public class Cabbage extends Vegetables {
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
	
	
	public Cabbage(int calorii, int price, String color, int weight ) {
		super(calorii, price, weight);
		this.color = color;
		
	}
	public Cabbage(){
		
	}
	@Override
	public String toString() {
		return "Cabbage [color=" + color + ", calorii=" + calorii + ", price="
				+ price + ", weight=" + weight + "]";
	}
	
	

}


