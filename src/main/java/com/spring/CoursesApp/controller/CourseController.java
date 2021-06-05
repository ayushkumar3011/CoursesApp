package com.spring.CoursesApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.CoursesApp.entity.Course;
import com.spring.CoursesApp.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "My HomePage";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@RequestBody Course course,@PathVariable String courseId) {
		return this.courseService.updateCourse(course);
	}
}
