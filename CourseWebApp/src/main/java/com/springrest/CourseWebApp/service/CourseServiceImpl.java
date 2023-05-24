package com.springrest.CourseWebApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.CourseWebApp.dao.CourseDao;
import com.springrest.CourseWebApp.entity.Course;
@Service
public class CourseServiceImpl implements CourseService{
     

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	
	@Override
	public Course getcourse(long courseId) {

		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourses(Course course) {
		
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

		
		courseDao.save(course);
		return course;
		
	}

	@Override
	public void deleteCourse(long parseLong) {
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	

}
