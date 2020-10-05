package com.strategy;

public class Bird extends Animal{

	public Bird(String name) {
		super(name);
		this.setFlyAbility(new WingFly());
	}
	
}
