package project01;

import java.io.Serializable;
import java.util.Arrays;

public class CustomerSort implements Serializable
{
	 public Customer[] sortCustomerByDob(Customer[] objArray) 
	 {
		 Arrays.sort(objArray, new CustomerDOBComparator());
		return objArray;
	}	
	 
	 public Customer[] sortCustomerByAge(Customer[] objArray) 
	 {
		 Arrays.sort(objArray, new CustomerAgeComparator());
		return objArray;
	}	
	 
	 

}
