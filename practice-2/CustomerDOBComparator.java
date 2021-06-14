package project01;

import java.util.Comparator;


public class CustomerDOBComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer obj1, Customer obj2) {
		
		
		return obj1.getDob().compareTo(obj2.getDob());
		
		
	}
	 
}
