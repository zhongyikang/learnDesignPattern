package com.strategy;

public class Animal {
	
	protected String name;
	private IsFly fly;
	
	
	
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void fly() {
		fly.fly();
	}
	public void setFlyAbility(IsFly fly) {
		this.fly = fly;
	}
	
	
	@Override
	public String toString() {
		return  name + " " + fly;
	}
	
	
	
}
