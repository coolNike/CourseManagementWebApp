package com.springrest.CourseWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.CourseWebApp.entity.Course;
import com.springrest.CourseWebApp.service.CourseService;

@RestController
public class MyController {
	@GetMapping("/home")
	public String home(){
		return "this is my home page";
	}
	@Autowired
	private CourseService courseService;
	
	//to get the list of courses
	@GetMapping("/courses")
	public List<Course> getCourseList(){
		return this.courseService.getCourses();
		
	}  
	
	//to get 1 course info
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId ) {
		return this.courseService.getcourse(Long.parseLong(courseId));
	}

	
	//to add  course info
	@PostMapping("/course")
	public Course addCourses(@RequestBody Course course) {
		return this.courseService.addCourses(course);
	}
	
	//to update course info
	@PutMapping("/update")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	//to delete course info
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			 this.courseService.deleteCourse(Long.parseLong(courseId));
			 return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

}
