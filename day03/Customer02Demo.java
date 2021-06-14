package com.ILPday03;

public class Customer02Demo {

	public static void main(String[] args) {
		
			Customer02 c1 = new Customer02(101, "var", "2/02/2020", 2000, "abc@gmail.com", 25);
			c1.toString();
			c1.display();
			
			Child02 c2 = new Child02(102, "varv", "23/02/2020", 5000, "abcd@gmail.com", 250, 1200, "savings", 100, 2);
			c2.toString();
			c2.display();
			
			
			Customer02 c3 = new  Child02(103, "varvi", "3/02/2020", 15000, "kabcd@gmail.com", 1250, 21200, "asavings", 900, 29);
			c3.toString();
			c3.display();
			

	}

}
