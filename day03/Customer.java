package com.ILPday03;

public class Customer {
	
		public int id;
		public String name;
		public String dob;
		public double salary;
		public String email;
		public int age;
		
		public Customer(int i, String n, String d, double s, String e, int a) 
		{
			this.id = i;
			this.name = n;
			this.dob = d;
			this.salary = s;
			this.email = e;
			this.age = a;
		}
	
		
		public void display() {
			
			System.out.println(id+ "	"   + name+ "	"   +  dob + "	"   +  salary + "	"   + email + "	"    + age);
		}
		

	}



