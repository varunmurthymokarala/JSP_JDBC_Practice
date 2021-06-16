package com.ilp.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.ilp.beans.BloodBanks;
import com.ilp.utilities.DbCon;

/* create table VM1980947_Blood_banks( 
    Blood_Bank_id number(12) primary key, 
    Blood_Bank_name varchar2(80) not null,
    Contact_number number(10) not null,
    Gender varchar2(11) not null, 
    Blood_group varchar2(30) not null, 
    City varchar2(80) not null, 
    comments varchar2(1000) 
);



CREATE SEQUENCE  VM1980947_Blood_Bank_ID_SEQ MINVALUE 1 START WITH 1 INCREMENT BY 1;
CREATE OR REPLACE TRIGGER VM198047_Blood_banks_TRG
BEFORE INSERT
ON VM1980947_Blood_banks REFERENCING NEW AS NEW OLD AS Old
FOR EACH ROW
WHEN (New.Blood_bank_ID is null)
BEGIN
	:new.Blood_bank_ID := VM1980947_Blood_Bank_ID_SEQ.nextval;
END;

Alter Trigger VM198047_Blood_banks_TRG enable;



insert into  VM1980947_Blood_banks( blood_bank_name,  contact_number, gender, blood_group,city) values ('Bigredbus',2512345, 'Male',  'O', 'Tampa');

insert into VM1980947_Blood_banks( blood_bank_name,  contact_number, gender, blood_group,city) values ( 'LifeStream', 2923460, 'Female',  'AB', 'Cleveland');

insert into VM1980947_Blood_banks( blood_bank_name,  contact_number, gender, blood_group,city) values ('UCLA', 3067894, 'Other',  'B', 'Dallas');

insert into VM1980947_Blood_banks( blood_bank_name,  contact_number, gender, blood_group,city) values ('CMS', 2023458, 'Male',  'A', 'Utah');

insert into VM1980947_Blood_banks( blood_bank_name,  contact_number, gender, blood_group,city) values ('Westcoast',  2597865, 'Male',  'A', 'California');


commit;

 * 
 *  
  */

public class BloodBanksDao implements DaoInterface<BloodBanks> {

	public static final String TABLE = "VM1980947_Blood_banks";

	public ArrayList<BloodBanks> findAll() {
		ArrayList<BloodBanks> Bloodbanks = new ArrayList<>();
		Connection con = DbCon.getConnection();
		try {
			String qry = "select * from " + TABLE;
			PreparedStatement st = con.prepareStatement(qry);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				BloodBanks b = new BloodBanks();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setNumber(rs.getInt(3));
				b.setGender(rs.getString(4));
				b.setBloodgroup(rs.getString(5));
				b.setCity(rs.getString(6));

				Bloodbanks.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}

		return Bloodbanks;
	}

	public BloodBanks findById(int id) {

		Connection con = DbCon.getConnection();
		BloodBanks b = new BloodBanks();
		try {
			String qry = "select * from " + TABLE + " where Blood_Bank_id = ?";
			PreparedStatement st = con.prepareStatement(qry);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setNumber(rs.getInt(3));
				b.setGender(rs.getString(4));
				b.setBloodgroup(rs.getString(5));
				b.setCity(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}

		return b;
	}

	public void update(BloodBanks b) {
		Connection con = DbCon.getConnection();
		try {
			if (b.getId() == null) {
				
			}else {
				
			
			String qry = "update " + TABLE + " set Blood_Bank_name = ?, Contact_number = ?, Gender = ?, Blood_group = ?,  City = ? where Blood_Bank_id = ?";
			PreparedStatement st = con.prepareStatement(qry);
			
			st.setString(1, b.getName());
			st.setInt(2, b.getNumber());
			st.setString(3, b.getGender());
			st.setString(4, b.getBloodgroup());
			st.setString(5, b.getCity());
			st.setInt(6, b.getId());
			st.executeUpdate(); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}
}
	public BloodBanks save(BloodBanks b) {
		Connection con = DbCon.getConnection();
		try {
			String qry = "insert into " + TABLE + "(Blood_Bank_name, Contact_number, Gender, Blood_group, city) values (?, ?, ?, ?, ?)";
			PreparedStatement st = con.prepareStatement(qry);
			st.setString(1, b.getName());
			st.setInt(2, b.getNumber());
			st.setString(3, b.getGender());
			st.setString(4, b.getBloodgroup());
			st.setString(5, b.getCity());
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}
		return b;
	}

	public void delete(int BankId) {
		Connection con = DbCon.getConnection();
		try {
			

			String qry = "delete from " + TABLE + " where Blood_Bank_id = ?";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1, BankId);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}
}


	public ArrayList<BloodBanks> findAllByCity(String city) {
		// TODO Auto-generated method stub
		ArrayList<BloodBanks> Bloodbanks = new ArrayList<>();
		Connection con = DbCon.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from " + TABLE + " where city = ?");

			ps.setString(1, city);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BloodBanks b = new BloodBanks();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setNumber(rs.getInt(3));
				b.setGender(rs.getString(4));
				b.setBloodgroup(rs.getString(5));
				b.setCity(rs.getString(6));
				
				Bloodbanks.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}

		return Bloodbanks;
	}
	
	public ArrayList<BloodBanks> findAllByBloodgroup(String bloodgroup) {
		// TODO Auto-generated method stub
		ArrayList<BloodBanks> Bloodbanks = new ArrayList<>();
		Connection con = DbCon.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from " + TABLE + " where Blood_group = ?");

			ps.setString(1, bloodgroup);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BloodBanks b = new BloodBanks();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setNumber(rs.getInt(3));
				b.setGender(rs.getString(4));
				b.setBloodgroup(rs.getString(5));
				b.setCity(rs.getString(6));
				
				Bloodbanks.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}

		return Bloodbanks;
	}
}
