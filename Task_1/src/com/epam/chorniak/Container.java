package com.epam.chorniak;

import java.util.Arrays;

public class Container {
	Car[] car = new Car[0];

	public void add(Car c) {
		int size = car.length;
		Car[] auto = new Car[size + 1];
		System.arraycopy(car, 0, auto, 0, size);
		auto[size] = c;
		car = new Car[auto.length];
		System.arraycopy(auto, 0, car, 0, auto.length);

	}

	@Override
	public String toString() {
		return "Container [car=" + Arrays.toString(car) + "]";
	}

	public void count() {
		System.out.println("Conteiner has " + car.length + " cars");
	}
	public Car getCarByIndex(int index){
		try{
		return car[index];
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Conteiner does not have car by this index");
		}
		return null;
		
	}
	public Car[] sortByPrice(){
		Car tmp;
		
		for (int i = 1; i < car.length; i++){
			for (int j = i; j > 0 && car[j - 1].getPrice() > car[j].getPrice(); j--){
				tmp = car[j];
				car[j] = car[j - 1];
				car[j -1] = tmp;
			}
		}
		return car;
	}

}
