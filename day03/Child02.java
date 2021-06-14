package com.ILPday03;

public class Child02 extends Customer02 {
	public int number;
	public String acType;
	public double balance;
	public int noOfAccountHolders;
	public Child02(int i, String n, String d, double s, String e, int a,int number, String acType, double balance, int noOfAccountHolders ) 
	{
		super(i,n, d, s,e,a);
		this.number = number;
		this.acType = acType;
		this.balance = balance;
		this.noOfAccountHolders = noOfAccountHolders;
		
	}
	
	public String toString() {
		super.toString();
		return "id : "+ id+" "+ "name : "+ name+ " "+ "dob : "+ dob+ "salary : "+salary+ " "+ "email: "+ email+ " "+"age : "+age +"  "+ "number : "+number +" "+"acType : "+acType+" "+"balance : "+ balance+ " "+"noOfAccountHolders : "+noOfAccountHolders;
	}
	
	public void display() {
		super.display();
		System.out.println(id+ "	"   + name+ "	"   +  dob + "	"   +  salary + "	"   + email + "	"    + age + "	"    + number + "	"    + acType + "	"   + balance + "	"   + noOfAccountHolders);
	}

}
