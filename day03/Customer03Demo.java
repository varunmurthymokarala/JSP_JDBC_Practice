package com.ILPday03;

public class Customer03Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer03 c1 = new Customer03(101, "var", "2/02/2020", 2000, "abc@gmail.com", 25);
		c1.display();
		c1.add(620.00);
		System.out.println(c1.getSalary());
		c1.add(710.00,30);
		System.out.println(c1.getSalary());	
		System.out.println(c1.getAge());
	}

}
