package com.epam.chorniak;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Container cont = new Container();
		
		Electrocar tesla = new Electrocar(2_000_000, "Tesla", 85);
		Electrocar lifan = new Electrocar(500_000, "Lifan", 150);
		Electrocar byd = new Electrocar(1500_000, "BYD", 100);
		Dieselcar vw = new Dieselcar(1000_000, "Volkswagen", 3000);
		Dieselcar audi = new Dieselcar(1400_000, "AUDI", 2000);
		
		cont.add(tesla);
		cont.add(lifan);
		cont.add(byd);
		cont.add(vw);
		cont.add(audi);
		System.out.println(cont.getCarByIndex(4));
		System.out.println(cont.toString());
		cont.count();
		
		System.out.println(Arrays.toString(cont.sortByPrice()));
		
		Electrocar.averagePrice();
		Dieselcar.averagePrice();

	}

}
