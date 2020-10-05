package com.singleton;

public class SingletonLazySynchronized {
	private static SingletonLazySynchronized instance = null;
	
	private SingletonLazySynchronized() {
		
	}
	
	public SingletonLazySynchronized getInstance() {
		synchronized (SingletonLazySynchronized.class) {
			if(instance == null) 
				instance = new SingletonLazySynchronized();
		}
		
		return instance;
	}
}
