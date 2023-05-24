package com.springrest.CourseWebApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.CourseWebApp.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
