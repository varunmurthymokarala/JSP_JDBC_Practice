package com.ILPday04;

public class Account extends BankData {
	private final int number;
	private final String acType;
	private final double balance;
	private final int noOfAccountHolders;

	// constructor
	public Account(String dob, double salary, String email, int age, int number, String acType, double balance,
			int noOfAccountHolders) {
		// assigning parent class values
		super(dob, salary, email, age);

		// assigning current class values
		this.number = number;
		this.acType = acType;
		this.balance = balance;
		this.noOfAccountHolders = noOfAccountHolders;
	}

	@Override
	protected double sumNumericAttributes() {
		return this.number + this.balance + this.noOfAccountHolders + super.salary + super.age;
	}

	@Override
	protected String concatAttributeValues() {
		return "Your DOB: " + super.dob + ", Your email: " + super.email + ", Your account type: " + this.acType + ".";
	}
}
