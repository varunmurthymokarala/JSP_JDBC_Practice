package com.ILPday04;

import project1.Customer;
import project1.NoIdFoundException;

public class CustomerDemo {
    /**
     * @param args
     */
	private static  boolean valied;
    public static void main(String[] args) {
    	valied = false;
        Customer c[] = new Customer[5];
        c[0] = new Customer(1, "Uday", "23/03/1994", 1100, "GTest123@test.com", 26);
        c[1] = new Customer(2, "Kumar", "24/05/1993", 1250, "GTest124@test.com", 23);
        c[2] = new Customer(3, "China", "25/03/1992", 1350, "GTest125@test.com", 24);
        c[3] = new Customer(4, "Teddy", "26/02/1991", 1400, "GTest126@test.com", 27);
        c[4] = new Customer(5, "Keerthi", "27/03/1995", 1000, "GTest127@test.com", 20);
        Customer rep = new Customer(6, "Virat", "01/01/1984", 1200000, "Virat@test.com", 22);
        try {
             replaceCustomerById(c, rep);
        } catch (NoIdFoundException e) {
             System.out.println(e.getMessage());
        }finally{
        	 System.out.println(valied);
        }
    }

    private static void replaceCustomerById(Customer[] c, Customer rep) throws NoIdFoundException  {
        for (int i = 0; i < c.length; i++) {
                if (c[i].getId() == rep.getId()) {
                        c[i] = rep;
                        valied = true;
                        return;
                }
        }
        valied = false;
        throw new  NoIdFoundException(rep.getId());
    }
}

