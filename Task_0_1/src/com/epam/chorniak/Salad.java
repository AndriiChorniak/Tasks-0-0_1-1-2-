package com.epam.chorniak;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Salad {
	private int resultCalorii;
	private int resultPrice;
	private int resultWeight;
	
	
	List<Vegetables> lis = new ArrayList<Vegetables>();
	

	public int getResultCalorii() {
		return resultCalorii;
	}

	public void setResultCalorii(int resultCalorii) {
		if (resultCalorii > 0)
			this.resultCalorii = resultCalorii;
		else
			System.out.println("incorrect value");
	}

	public int getResultPrice() {
		return resultPrice;
	}

	public void setResultPrice(int resultPrice) {
		if (resultPrice > 0)
			this.resultPrice = resultPrice;
		else
			System.out.println("incorrect value");
	}

	public int getResultWeight() {
		return resultWeight;
	}

	public void setResultWeight(int resultWeight) {
		if (resultWeight > 0)
			this.resultWeight = resultWeight;
		else
			System.out.println("incorrect value");
	}

	public Salad(Vegetables[] veg) {
		resultCalorii = 0;
		resultPrice = 0;
		resultWeight = 0;
		for(int i=0; i < veg.length;i++){
			lis.add(veg[i]);
			resultCalorii += veg[i].getCalorii() * veg[i].getWeight();
			resultPrice += veg[i].getPrice() * veg[i].getWeight();
			resultWeight += veg[i].getWeight();
		}
		
	}

	public Salad() {

	}

	@Override
	public String toString() {
		return "Salad has " + resultCalorii + " calories. It costs "
				+ resultPrice + "$ and weights " + resultWeight+"kg";
	}
	
	public void sortByPrice(){
		Collections.sort(lis);
		System.out.println(lis);
		}
	
	public void findVegetablesBetweenCalorii(int first, int second){
		for (Vegetables v : lis){
			if (v.getCalorii() >= first && v.getCalorii() <= second)
				System.out.println(v.toString());
		}
	}

}
