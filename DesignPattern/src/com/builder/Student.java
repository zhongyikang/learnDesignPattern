package com.builder;

public class Student {
	
	



	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	
	private Student() {
		super();
	}

	private Student(String firstName, String lastName, int age, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	
	public static class Builder {

		private String firstName;
		private String lastName;
		private int age;
		private String gender;
		
		
		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public Builder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Student build() {
			return new Student(this.firstName,this.lastName,this.age,this.gender);
		}
		
		
		
		
	}
	
	
}
