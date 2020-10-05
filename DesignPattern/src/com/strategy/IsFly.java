package com.strategy;

public interface IsFly {
	void fly();
}

class WingFly implements IsFly{

	@Override
	public void fly() {
		System.out.println("flying with wing");
	}
	
}


class CantFly implements IsFly{

	@Override
	public void fly() {
		System.out.println("can't fly");
	}
	
}