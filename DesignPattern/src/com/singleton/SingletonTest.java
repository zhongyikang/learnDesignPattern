package com.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonLazy instance1 = SingletonLazy.getInstance();
		SingletonLazy instance2 = SingletonLazy.getInstance();
		System.out.println(instance1 == instance2);
	}
}
