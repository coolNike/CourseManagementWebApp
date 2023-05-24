package com.springrest.CourseWebApp.service;

import java.util.List;

import com.springrest.CourseWebApp.entity.Course;

public interface CourseService {
	
	

	public List<Course> getCourses();

	public Course getcourse(long courseId);

	public Course addCourses(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);

}
