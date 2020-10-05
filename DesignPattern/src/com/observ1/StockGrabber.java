package com.observ1;

import java.util.ArrayList;

/**
 * 
* @Description   ���ܹ�Ʊ��Ϣ�� ������������
* @author zhongyikang  Email:2472082117@qq.com 
* @version   
* @date Oct 3, 20208:11:47 PM  
*
 */
public class StockGrabber implements Subject{
	

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double gooPrice;
	private double appPrice;
	
	
	
	
	public StockGrabber() {
		observers = new ArrayList<>();
	}

	/**
	 * ÿ����Ϣ�޸Ķ�Ҫʹ��nitify
	 */
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		//notifyObserver();
		System.out.println("���ĳɹ���");
	}

	@Override
	public void unregister(Observer o) {
		int index = observers.indexOf(o);
		observers.remove(index);
		
		notifyObserver();
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(ibmPrice, gooPrice, appPrice);
		}
	}
	
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setGooPrice(double gooPrice) {
		this.gooPrice = gooPrice;
		notifyObserver();
	}

	public void setAppPrice(double appPrice) {
		this.appPrice = appPrice;
		notifyObserver();
	}

}
