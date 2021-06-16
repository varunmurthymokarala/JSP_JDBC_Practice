package com.ilp.service;

import java.util.ArrayList;
import java.util.List;

import com.ilp.beans.BloodBanks;
public interface ServiceInterface<T> {
	
	ArrayList<T> findAll();
	
	T findById(int id);
	
	void update(T obj);
	
	T save(T obj);
	
	void delete(int id);

	List<BloodBanks> findAllByBloodGroup(String bloodGroup);

	List<BloodBanks> findAllByCity(String city);

}
