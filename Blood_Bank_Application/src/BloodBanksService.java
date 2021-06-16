package com.ilp.service;

import java.util.ArrayList;
import java.util.List;

import com.ilp.beans.BloodBanks;
import com.ilp.dal.BloodBanksDao;

public class BloodBanksService implements ServiceInterface<BloodBanks> {
	
	private static BloodBanksDao dao;
	public BloodBanksService() {
	dao = new BloodBanksDao();
}

	@Override
	public ArrayList<BloodBanks> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public BloodBanks findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
	
	@Override
	public List<BloodBanks> findAllByCity(String city) {
		// TODO Auto-generated method stub
		return dao.findAllByCity(city);
	}
	
	@Override
	public List<BloodBanks> findAllByBloodGroup(String bloodGroup) {
		// TODO Auto-generated method stub
		return dao.findAllByBloodgroup(bloodGroup);
	}

	@Override
	public void update(BloodBanks obj) {
		// TODO Auto-generated method stub
		dao.update(obj);
		
	}

	@Override
	public BloodBanks save(BloodBanks obj) {
		// TODO Auto-generated method stub
		return dao.save(obj);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


}
