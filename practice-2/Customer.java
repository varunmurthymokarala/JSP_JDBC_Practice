package project01;



public class Customer {

	private int id;
	private String name;
	private String dob;
	private double Salary;
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
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
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
	
	public Customer(int id, String name, String dob, double Salary, String email, int age ) 
	{
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.Salary = Salary;
		this.email = email;
		this.age = age;
		
	}
	
	
	}

	

	


