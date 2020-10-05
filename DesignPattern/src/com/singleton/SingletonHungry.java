package com.singleton;

public class SingletonHungry {
	private static SingletonHungry instance = new SingletonHungry();
	
	private SingletonHungry() {
		
	}
	
	public SingletonHungry getInstance() {
		return instance;
	}

}
