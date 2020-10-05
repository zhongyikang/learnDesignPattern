package com.observ1;


public interface Observer {
	
	public void update(double ibmPrice, double gooPrice, double appPrice);
	
	/**
	 * 
	* @Description   add the Observer to serveral Subject
	* @author zhongyikang  
	* @date Oct 3, 20208:35:26 PM  
	* @param subject
	 */
	public void addSubject(Subject subject);
}
