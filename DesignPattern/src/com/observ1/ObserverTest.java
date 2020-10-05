package com.observ1;

public class ObserverTest {
	public static void main(String[] args) {
		StockGrabber grabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(grabber);
		
		grabber.setAppPrice(12);
		StockObserver observer2 = new StockObserver(grabber);
		
		grabber.setGooPrice(131);
		
		StockGrabber grabber2 = new StockGrabber();
		observer1.addSubject(grabber2);
		
		grabber2.setIbmPrice(111);
	}
}
