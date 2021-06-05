package com.spring.CoursesApp.service;

import java.util.List;

import com.spring.CoursesApp.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);

}
