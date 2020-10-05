package com.observ1;

public interface Subject {
	
	/**
	 * 
	* @Description 注册观察者，可以理解为订阅者   
	* @author zhongyikang  
	* @date Oct 3, 20208:10:52 PM  
	* @param o
	 */
	public void register(Observer o);
	public void unregister(Observer o);
	
	/**
	 * 
	* @Description   展示所有的观察者信息
	* @author zhongyikang  
	* @date Oct 3, 20208:10:26 PM
	 */
	public void notifyObserver();
}
