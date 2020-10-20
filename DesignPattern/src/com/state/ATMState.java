package com.state;

public interface ATMState {
	
	// Different states expected
	// HasCard, NoCard, HasPin, NoCash
	
	
	//以下四个方法，是不同行为的行为。 不同的state有不同的处理方式。
	void insertCard();
	
	void ejectCard();
	
	void insertPin(int pinEntered);
	
	void requestCash(int cashToWithdraw);
	
}
