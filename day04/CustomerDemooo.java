package com.ILPday04;

public class CustomerDemooo {

	public static void main(String[] args) {
		Account account = new Account("nemo", 1, "kemo@gmail.com", 23, 182011, "savings", 1, 1);
		System.out.println(account.concatAttributeValues());
		System.out.println(account.sumNumericAttributes());
	}
}
