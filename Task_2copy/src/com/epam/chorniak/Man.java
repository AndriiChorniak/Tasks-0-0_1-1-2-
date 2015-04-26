package com.epam.chorniak;

public class Man extends Human {
	
	public Man(String firstName, String lastName, double height, double weight) {
		super(firstName, lastName, height, weight);
		this.sex = true;
	}

	public Man() {
	}

	public boolean getSex() {
		return sex;
	}
	
	@Override
	public String toString() {
		return "Man [sex=" + sex + ", firstName=" + firstName + ", lastName="
				+ lastName + ", height=" + height + ", weight=" + weight + "]";
	}

}
