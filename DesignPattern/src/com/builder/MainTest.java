package com.builder;

public class MainTest {
	public static void main(String[] args) {
		Student student = new Student.Builder()
		.setAge(12).setFirstName("zhong").setLastName("hh").setGender("M").build();
		System.out.println(student);
	}
}
