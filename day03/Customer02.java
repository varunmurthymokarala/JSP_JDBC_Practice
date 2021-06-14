package com.ILPday03;

public class Customer02 {
	public int id;
	public String name;
	public String dob;
	public double salary;
	public String email;
	public int age;
	
	public Customer02(int id, String name, String dob, double salary, String email, int age) 
	{
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.email = email;
		this.age = age;
	}
	
	public String toString() {
		return "id : "+ id+" "+ "name : "+ name+ " "+ "dob : "+ dob+ "salary : "+salary+ " "+ "email: "+ email+ " "+"age : "+age;
	}

	
	public void display() {
		
		System.out.println(id+ "	"   + name+ "	"   +  dob + "	"   +  salary + "	"   + email + "	"    + age);
	}
	

}
