package com.observ1;

public interface Subject {
	
	/**
	 * 
	* @Description ע��۲��ߣ��������Ϊ������   
	* @author zhongyikang  
	* @date Oct 3, 20208:10:52 PM  
	* @param o
	 */
	public void register(Observer o);
	public void unregister(Observer o);
	
	/**
	 * 
	* @Description   չʾ���еĹ۲�����Ϣ
	* @author zhongyikang  
	* @date Oct 3, 20208:10:26 PM
	 */
	public void notifyObserver();
}
