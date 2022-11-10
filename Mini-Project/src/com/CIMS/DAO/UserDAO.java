package com.CIMS.DAO;

import com.CIMS.Exceptions.UserException;
import com.CIMS.Model.User;

public interface UserDAO {
	public String registerUser(User user)throws UserException;
	public User UserLogIn(String username,String password)throws UserException;

}
