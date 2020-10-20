package com.state;

public class TestATMMachine {

	
	public static void main(String[] args){
		/**
		 * 每一个ATMMachine有四种状态。 
	 		HasCard   NoCard   HasPin   NoCash
	 		
		 * 每一种状态当执行特定的操作(插卡、取卡、存钱、取钱)的时候，有特定的行为。
		 * ATM和人交互， 过程中， 状态改变， 行为改变。
		 */
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard(); //每个行为背后，都要修改ATMState.
		//这个行为是插卡。
		//后面执行atmState.insertCard(); //这里是没有卡， 会有提示打印 + 状态修改为hasCard.
		
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
		atmMachine.requestCash(2000);
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
	}	
}
