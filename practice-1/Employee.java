package project01;

public class Employee {
	
	private long empNo;
	private String name;
	public long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	private String designation;
	private double basicPay;
	
	Employee(){
		
	}
	Employee(long empNo, String name, String designation, double basicPay){
	this.empNo = empNo;	
	this.name = name;
	this.designation = designation;
	this.basicPay = basicPay;
	}
	
	void generatesalaryslip() {
		int BasicPay = (int)basicPay;
	    int CCA= (15*BasicPay/100);
	    int HRA=(20*BasicPay/100);
	    int tax = (((BasicPay+HRA+CCA)*10)/100);
	    int netsalary = ((BasicPay+HRA+CCA) - tax); 
		
		
		System.out.println("	    ABC Company\n" + "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n"+
		"	    Salary Slip\n" +
				"Month : Jan		Year : 2021\n" +  "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n"+
		"Emp ID : " +empNo+ "			"+"Name : "+ name+"\n"+
		"Designation : " +designation+ "	"+"Basic Pay : "+BasicPay+"\n"+
				
		"CCA : " + CCA+ "		  "+ "HRA : "+ HRA+ "\n" +
		"Tax : " + tax+ "		  "+ "Net Salary : "+ netsalary+"\n"+  "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n" );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee(1001, "Anto", "Consultant", 1000);
		E1.generatesalaryslip();
		
		Employee E2 = new Employee(1002, "Varun", "SDE-1", 140000);
		E2.generatesalaryslip();

	}
	

}
