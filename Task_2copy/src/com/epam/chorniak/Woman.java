package com.epam.chorniak;

import java.util.*;

import com.epam.chorniak.exception.ChildHasNotBorn;

public class Woman extends Human {
		
	public boolean getSex() {
		return sex;
	}

	public Woman(String firstName, String lastName, double height, double weight) {
		super(firstName, lastName, height, weight);
		this.sex = false;
	}

	public Woman() {
	}

	@Override
	public String toString() {
		return "Woman [sex=" + sex + ", firstName=" + firstName + ", lastName="
				+ lastName + ", height=" + height + ", weight=" + weight + "]";
	}

	public Human bornChild(Man m) throws ChildHasNotBorn {
		System.out.println("input firstName of child");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		Random rand = new Random();
		if (rand.nextDouble() < 0.5)
			return new Woman(name, m.lastName, height + 0.1* (m.height - height), weight + 0.1 * (m.weight - weight));
		else if (rand.nextDouble() >= 0.5)
			return new Man(name, m.lastName, m.height + 0.1* (height - m.height), m.weight + 0.1 * (weight - m.weight));
		throw new ChildHasNotBorn();
		
	}

}
