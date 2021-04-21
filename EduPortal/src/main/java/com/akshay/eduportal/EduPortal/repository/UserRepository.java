package com.akshay.eduportal.EduPortal.repository;

import java.util.List;
import com.akshay.eduportal.EduPortal.model.User;

public interface UserRepository {
	User insertOrUpdate(User c);
	User findById(long id);
	void deleteById(long id);
	List<User> listAll();
	
}
