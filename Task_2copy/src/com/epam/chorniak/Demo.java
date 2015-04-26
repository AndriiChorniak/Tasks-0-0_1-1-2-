package com.epam.chorniak;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.epam.chorniak.exception.ChildHasNotBorn;

public class Demo {
	public static Human test(Human first, Human second) throws ChildHasNotBorn {
		Human child = first.haveContact(second);
		return child;
	}

	public static Human createHuman() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter firstName: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter lastName: ");
		String lastName = scanner.nextLine();
		System.out.println("Enter weight: ");
		int weight = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter height: ");
		int height = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter sex: ");
		String sex = scanner.nextLine();
		if (sex.equalsIgnoreCase("M")) {
			return new Man(firstName, lastName, height, weight);
		}
		if (sex.equalsIgnoreCase("W")) {
			return new Woman(firstName, lastName, height, weight);
		}
		throw new NoSuchElementException();
	}

	public static void main(String[] args) {
		System.out.println("create first human");
		Human human1 = createHuman();
		System.out.println(human1);
		System.out.println("create second human");
		Human human2 = createHuman();

		try {
			Human n = test(human1, human2);
			System.out.println(n);
		} catch (ChildHasNotBorn e) {
			System.err.println("Razoshlis");
		}
	}
}
