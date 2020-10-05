package com.strategy;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		this.setFlyAbility(new CantFly());
	}
	
}
