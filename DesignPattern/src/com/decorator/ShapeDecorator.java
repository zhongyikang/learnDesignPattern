package com.decorator;

public abstract class ShapeDecorator implements Shape {
	   protected Shape decoratedShape; //concret shape，the implement of the interface shape

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	
	}