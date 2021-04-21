package com.akshay.eduportal.EduPortal.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.akshay.eduportal.EduPortal.model.Course;

public class CourseRepositoryImpl implements CourseRepository {

	@PersistenceContext
	EntityManager em;
	@Override
	public Course insertOrUpdate(Course c) {

		if(c.getId()==null) {
			em.persist(c);
		}
		else {
			em.merge(c);
		}
		return c;
	}

	@Override
	public Course findById(long id) {
		Course c=em.find(Course.class, id);
		return c;
	}

	@Override
	public void deleteById(long id) {
		Course c=em.find(Course.class, id);
		em.remove(c);
	}

	@Override
	public List<Course> listAll() {
		TypedQuery<Course> query=em.createQuery("select * from course",Course.class);
		List<Course> allCourses=query.getResultList();
		return allCourses;
	}

}
