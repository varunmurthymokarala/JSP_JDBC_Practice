package com.ilp;

import java.util.ArrayList;

import com.ilp.beans.BloodBanks;
import com.ilp.dal.BloodBanksDao;

public class BloodBanksDemo {

	private static BloodBanksDao dao = new BloodBanksDao();

	public static void main(String[] args) {

		System.out.println("Listing all Blood Banks");
		ArrayList<BloodBanks> Bloodbanks = dao.findAll();
		displayAllBloodbanks(Bloodbanks);

		BloodBanks b = new BloodBanks();
		// b.setName("NYC");
		// b.setNumber(2309876);
		// b.setGender("Female");
		// b.setBloodgroup("O");
		// b.setCity("New York");
		// dao.save(b);

		displayAllBloodbanksByCity("Tampa");

		b = dao.findById(3);
		System.out.println("\n" + "List the Blood Bank By id = 3");
		System.out.println(b);

		System.out.println(b.getName() + "  " + b.getCity());
		b.setName("SaveLife");
		b.setCity("Boston");
		dao.update(b);
		displayAllBloodbanksByBloodgroup("B");
		
		
		//b = dao.findById(21);
		//System.out.println(b);
		//dao.delete(b.getId());
	
		//displayAllBloodbanks(Bloodbanks);

		// displayAllBloodbanksByBloodgroup("A");
	}

	private static void displayAllBloodbanks(ArrayList<BloodBanks> Bloodbanks) {
		for (BloodBanks b : Bloodbanks) {
			System.out.println(b);
		}
	}

	private static void displayAllBloodbanksByCity(String city) {
		ArrayList<BloodBanks> Bloodbanks = dao.findAllByCity(city);

		System.out.println("\n" + "Listing all Blood Banks by City " + city);
		displayAllBloodbanks(Bloodbanks);
	}

	private static void displayAllBloodbanksByBloodgroup(String bloodgroup) {
		ArrayList<BloodBanks> Bloodbanks = dao.findAllByBloodgroup(bloodgroup);

		System.out.println("\n" + "Listing all Blood Banks by Blood group " + bloodgroup);
		displayAllBloodbanks(Bloodbanks);
	}

}
