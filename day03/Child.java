package com.ILPday03;

public class Child extends Customer {
	

		public int number;
		public String acType;
		public double balance;
		public int noOfAccountHolders;
		public Child(int i, String n, String d, double s, String e, int a,int number, String acType, double balance, int noOfAccountHolders ) 
		{
			super(i,n, d, s,e,a);
			this.number = number;
			this.acType = acType;
			this.balance = balance;
			this.noOfAccountHolders = noOfAccountHolders;
			
		}
		public void display() {
			//System.out.println("");
			
			System.out.println(id+ "	"   + name+ "	"   +  dob + "	"   +  salary + "	"   + email + "	"    + age + "	"    + number + "	"    + acType + "	"   + balance + "	"   + noOfAccountHolders);
		}
		}
		
		





