package com.epam.chorniak;

public class Carrot extends Vegetables {
	
	
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
	
	public Carrot(int calorii, int price, String color, int weight) {
		super(calorii, price,  weight);
		this.color = color;
		
	}
	public Carrot(){
		
	}
	@Override
	public String toString() {
		return "Carrot [color=" + color + ", calorii=" + calorii + ", price="
				+ price + ", weight=" + weight + "]";
	}
	
	

}

