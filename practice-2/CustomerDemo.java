package project01;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Customer customer1 = new Customer(101,"James", "01/01/2020", 13000.00,"abc@gmail.com", 24);
//		Customer customer2=new Customer(102,"Johnn", "08/08/2020", 15000.00,"dac@gmail.com", 30);
//		Customer customer3 = new Customer(103,"knorr", "09/09/2020", 14000.00,"ddd@gmail.com", 27);
//		Customer customer4 = new Customer(104,"Mangl", "06/06/2020", 18000.00,"ccc@gmail.com", 28);
//		Customer customer5 = new Customer(105,"Kanee", "07/07/2020", 19000.00,"bbc@gmail.com", 29);
		
		Customer customer1= new Customer(59,"izlmoem","ahjtxjx",572.0,"qfealhm",60);
		Customer customer2= new Customer(72,"ejczjvf","fhepzji",353.0,"dwzbvuz",79);
		Customer customer3= new Customer(69,"pzppkvb","qusehml",85.0,"jdkjyak",85);
		Customer customer4= new Customer(88,"jbmawaw","fuihkfg",344.0,"sxealpr",13);
		Customer customer5= new Customer(7,"zfwlhpm","lmbgdtk",372.0,"ucrsjqb",15);

		Customer[] objArray= {customer1,customer2,customer3,customer4,customer5};
		CustomerSort customerSort =new CustomerSort();
		Customer[] objArrayRes= customerSort.sortCustomerByDob(objArray);
		System.out.println("Displaying contents of array: ");

		for(Customer customer:objArrayRes){
		System.out.println(customer.getId()+" " + customer.getName()+" " + customer.getDob()+" " + customer.getSalary()+" " + customer.getEmail()+" " + customer.getAge()+" ");
		}
		
		Customer customerAge1= new Customer(38,"tduceta","chmryfw",262.0,"lplikky",24);
		Customer customerAge2= new Customer(22,"lbgdebt","ywkbqii",337.0,"xblqfup",51);
		Customer customerAge3= new Customer(46,"xhlxlpe","oygfqeb",334.0,"jagoquu",74);
		Customer customerAge4= new Customer(38,"xgpmopy","sfxcoez",236.0,"zqfkkcm",67);
		Customer customerAge5= new Customer(58,"xitmryb","omrbzpi",583.0,"xdwvtun",83);
		
		Customer[] objAgeArray= {customerAge1,customerAge2,customerAge3,customerAge4,customerAge5};
		
	
	System.out.println("Displaying contents of array afer age sort: ");
	
	
	for(Customer customer:customerSort.sortCustomerByAge(objAgeArray)){
		System.out.println(customer.getId()+" " + customer.getName()+" " + customer.getDob()+" " + customer.getSalary()+" " + customer.getEmail()+" " + customer.getAge()+" ");
		}
	}
}
	
