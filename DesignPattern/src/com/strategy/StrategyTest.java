package com.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Dog dog = new Dog("����");
		
		Bird bird = new Bird("ţţ");
		
		dog.fly();
		bird.fly();
		
	}
}
