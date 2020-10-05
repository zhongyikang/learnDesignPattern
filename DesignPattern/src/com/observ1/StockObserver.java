package com.observ1;

public class StockObserver implements Observer{

	public int getObserverId() {
		return observerId;
	}

	private Subject stockGrabber;
	
	private static int observerIdTracker = 0;
	
	private int observerId;
	
	private double ibmPrice;
	private double gooPrice;
	private double appPrice;
	
	public StockObserver(Subject stockGrabber) {
		super();
		this.stockGrabber = stockGrabber;
		
		 ++ observerIdTracker;
		 
		 observerId = observerIdTracker;
		
		stockGrabber.register(this);
	}



	@Override
	public void update(double ibmPrice, double gooPrice, double appPrice) {
		this.ibmPrice = ibmPrice;
		this.gooPrice = gooPrice;
		this.appPrice = appPrice;
		
		printInfo();
	}



	private void printInfo() {
		System.out.println("Observer:" + observerId);
		System.out.println("ibmPrice: " + ibmPrice);
		System.out.println("gooPrice: " + gooPrice);
		System.out.println("appPrice: " + appPrice + "\n");
	}



	@Override
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subject.register(this);
	}
	
	

	
}
