package com.ILPday04;

import project1.NegativeValueException;

public class Vehicle {
	
	private int number;
	private String name;
	private double price;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws NegativeValueException {
		check(price);
		this.price = price;
	}
	public Vehicle(int number, String name, double price) throws NegativeValueException {
		check(price);
		this.number = number;
		this.name = name;
		this.price = price;
	}
	private void check(double price) throws NegativeValueException {
		// TODO Auto-generated method stub
		if(price < 0)
			throw new NegativeValueException(price);
	}
	

}
