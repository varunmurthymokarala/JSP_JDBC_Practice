package com.demo.dal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.demo.utilities.DbCon;


/* 
 * create table VM1980947_users( 
    user_id number(12) primary key, 
    user_name varchar2(80) not null,
    password varchar2(80) not null
);

insert into vm1980947_users(user_id, user_name, password) values (101, 'John', 'Password123');
insert into vm1980947_users(user_id, user_name, password) values (102, 'kim', 'Password456');
insert into vm1980947_users(user_id, user_name, password) values (103, 'Ryan', 'Password789');
insert into vm1980947_users(user_id, user_name, password) values (104, 'Jeff', 'Password444');
insert into vm1980947_users(user_id, user_name, password) values (105, 'Sam', 'Password333');

commit;

 * 
 * 
 * */

public class UserDAO {

	public static final String TABLE = "VM1980947_users";

	public static boolean checkLogin(String u, String p) {
		boolean status = false;
		Connection con = DbCon.getConnection();
		try {
			
			PreparedStatement st = con.prepareStatement("select count(*) as validCred from "  + TABLE + " where USER_NAME IN (?) and PASSWORD IN (?) ");
			st.setString(1, u);
			st.setString(2, p);
			
			ResultSet rs = st.executeQuery();
			int count =0;
			while(rs.next())
			{
				count = rs.getInt("validCred");
			}
			status = count>0 ? true :false; 
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

}
