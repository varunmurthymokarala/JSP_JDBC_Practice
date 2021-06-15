package com.ILPday04;

public abstract class BankData {
	protected final String dob;
	protected final double salary;
	protected final String email;
	protected final int age;

	// constructor
	public BankData(String dob, double salary, String email, int age) {
		this.dob = dob;
		this.salary = salary;
		this.email = email;
		this.age = age;
	}

	protected abstract double sumNumericAttributes();

	protected abstract String concatAttributeValues();
}
