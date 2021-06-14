package project01;



import java.util.Comparator;


public class CustomerAgeComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer obj1, Customer obj2) {
		
		int compareValue= obj1.getAge()<obj2.getAge()?-1:
			obj1.getAge()>obj2.getAge()?1:0;
		return compareValue;
		
		
	}
	 
}
