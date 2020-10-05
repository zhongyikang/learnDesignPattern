package com.builder;

public class MainTest {
	public static void main(String[] args) {
		//创建一个builder， 和student有same field， 每个set方法返回builder。等到觉得构建结束了
		//使用build方法， 把每个field传入Student的全参构造器中， 返回。
		Student student = new Student.Builder()
		.setAge(12).setFirstName("zhong").setLastName("hh").setGender("M").build();
		System.out.println(student);
	}
}
