package com.akshay.eduportal.EduPortal.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.akshay.eduportal.EduPortal.model.User;

public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public User insertOrUpdate(User u) {
		if(u.getId()==null) {
			em.persist(u);
		}
		else {
			em.merge(u);
		}
		return u;
	}

	@Override
	public User findById(long id) {
		User u=em.find(User.class, id);
		return u;
	}

	@Override
	public void deleteById(long id) {
		User u=em.find(User.class, id);
		em.remove(u);
	}

	@Override
	public List<User> listAll() {
		TypedQuery<User> query=em.createQuery("Select * from user",User.class);
		List<User> allUsers=query.getResultList();
		return allUsers;
	}

}
