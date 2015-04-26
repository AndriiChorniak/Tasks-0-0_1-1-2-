package com.epam.chorniak;

import java.util.Random;

import com.epam.chorniak.exception.ChildHasNotBorn;

public class Human {
	protected String firstName;
	protected String lastName;
	protected double height;
	protected double weight;
	protected boolean sex;

	public Human(String firstName, String lastName, double height, double weight) {
		super();
		if (firstName == null || firstName == "" || firstName == " ")
			System.out.println("input correct firstName");
		else
			this.firstName = firstName;
		if (lastName == null || lastName == "" || lastName == " ")
			System.out.println("input correct lastName");
		else
			this.lastName = lastName;
		if (height > 0)
			this.height = height;
		if (weight > 0)
			this.weight = weight;
	}

	public Human() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName == "" || firstName == " ")
			System.out.println("input correct firstName");
		else
			this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName == "" || lastName == " ")
			System.out.println("input correct lastName");
		else
			this.lastName = lastName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0)
			this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0)
			this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName
				+ ", height=" + height + ", weight=" + weight + "]";
	}

	public boolean speak(Human h) {
		if (!this.sex || !h.sex)
			return true;
		else {
			Random rand = new Random();
			if (rand.nextDouble() <= 0.5)
				return true;
		}
		return false;
	}

	public boolean sufferCompany(Human h) {
		if (!this.sex) {
			Random rand = new Random();
			if (rand.nextDouble() <= 0.05)
				return true;
		} else if (this.sex != h.sex) {
			Random rand = new Random();
			if (rand.nextDouble() <= 0.7)
				return true;
		} else {
			Random rand = new Random();
			if (rand.nextDouble() <= 0.056)
				return true;
		}
		return false;
	}

	public boolean spendTimeTogether(Human h) {
		double firstHeight = this.height;
		double secondHeight = h.height;
		if (firstHeight > secondHeight) {
			if ((firstHeight - secondHeight) > firstHeight * 0.1) {
				Random rand = new Random();
				if (rand.nextDouble() <= 0.85)
					return true;
			} else if ((firstHeight - secondHeight) < firstHeight * 0.1) {
				Random rand = new Random();
				if (rand.nextDouble() <= 0.95)
					return true;
			}
		} else if (secondHeight > firstHeight) {
			if ((secondHeight - firstHeight) > secondHeight * 0.1) {
				Random rand = new Random();
				if (rand.nextDouble() <= 0.85)
					return true;
			} else if ((secondHeight - firstHeight) < secondHeight * 0.1) {
				Random rand = new Random();
				if (rand.nextDouble() <= 0.95)
					return true;
			}
		}

		return false;
	}

	public Human haveContact(Human h) throws ChildHasNotBorn {
		if (this.sex != h.sex) {
			if (this.speak(h) && this.sufferCompany(h)&& this.spendTimeTogether(h)) {
				if (this.sex)
					return ((Woman) h).bornChild((Man) this);
				else
					return ((Woman) this).bornChild((Man) h);
			}

		}
		throw new ChildHasNotBorn();	
	}
	
	

}
