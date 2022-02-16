package com.ntt.NttProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ntt.NttProject.business.abstracts.UserService;
import com.ntt.NttProject.dataAccess.abstracts.UsersDao;
import com.ntt.NttProject.entities.concretes.User;

public class UserManager implements UserService {

	 private UsersDao userDao;
	 
	@Autowired
	public UserManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

}
