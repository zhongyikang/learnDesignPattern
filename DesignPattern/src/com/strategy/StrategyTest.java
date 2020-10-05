package com.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Dog dog = new Dog("¿µ¿µ");
		
		Bird bird = new Bird("Å£Å£");
		
		dog.fly();
		bird.fly();
		
	}
}
