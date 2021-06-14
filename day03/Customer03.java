package com.ILPday03;


public class Customer03 {
	private int id;
	private String name;
	private String dob;
	private double salary;
	private String email;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Customer03(int i, String n, String d, double s, String e, int a) {
		this.id = i;
		this.name = n;
		this.dob = d;
		this.salary = s;
		this.email = e;
		this.age = a;
	}

	public void display() {

		System.out.println(id + "	" + name + "	" + dob + "	" + salary + "	" + email + "	" + age);
	}

	public void add(double salary) {
		this.salary = salary;

	}

	public void add(double salary, int age) {
		this.salary = salary;
		this.age = age;
	}}



