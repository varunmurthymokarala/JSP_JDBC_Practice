package com.ilp.Services;

import java.util.ArrayList;
public interface ServiceInterface<T> {
	
	ArrayList<T> findAll();
	
	T findById(int id);
	
	void update(T obj);
	
	T save(T obj);
	
	void delete(int id);

}
