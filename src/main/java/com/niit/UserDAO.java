
	package com.niit;

	import org.springframework.stereotype.Repository;

	@Repository
	public class UserDAO {
		public boolean isValidUser(String name,String password) 
		{
			if(name.equals("BALAJAIHO") && password.equals("india"))
			{
				return true;
				
			}else
			{
				return false;
				
			}
		}
}