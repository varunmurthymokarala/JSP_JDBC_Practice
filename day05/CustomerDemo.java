package ILPday05;

import java.util.ArrayList;

public class CustomerDemo {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>();

		customers.add(new Customer(100, "abcd", "12/2/34", 1500, "abc@test.com", 25));
		customers.add(new Customer(101, "bbcd", "02/2/34", 2509, "ybc@test.com", 65));
		customers.add(new Customer(102, "cbcd", "42/2/34", 2200, "avc@test.com", 75));
		customers.add(new Customer(103, "bkcd", "72/2/34", 2540, "abi@test.com", 85));
		customers.add(new Customer(104, "abud", "92/2/34", 2580, "lbc@test.com", 95));

		System.out.println(getOddPoistionCustomer(customers));
	}

	public static ArrayList<Customer> getOddPoistionCustomer(ArrayList<Customer> customers) {

		ArrayList<Customer> obj = new ArrayList<Customer>();
		System.out.println("Elements at the odd position are : ");
		for (int i = 1; i < customers.size(); i = i + 2) {

			// System.out.println(customers.get(i).getId() + " ");
			obj.add(customers.get(i));
		}
		return obj;

	}

}
