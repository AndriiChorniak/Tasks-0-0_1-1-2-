package com.epam.chorniak;



public class Demo {

	public static void main(String[] args) {
		
		Vegetables [] veg = new Vegetables[] {new Potato(10, 6, "brown", 2), new Cabbage(7, 8, "white", 3), new Carrot(8, 5, "orange", 3)};
		Salad sal = new Salad(veg);
		System.out.println(sal.toString());
		sal.sortByPrice();
		sal.findVegetablesBetweenCalorii(8, 10);
		
		
		

	}

}
