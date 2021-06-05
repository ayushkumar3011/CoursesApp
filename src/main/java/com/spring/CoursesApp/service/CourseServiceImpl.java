package com.spring.CoursesApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.CoursesApp.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list =new ArrayList<>();
		list.add(new Course(1001,"Java Core","This is a Java Course."));
		list.add(new Course(1002,"Python Programming","This is for Python developers"));
		list.add(new Course(1003,"C language","Get to read about C."));
	}
	
	
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}



	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}



	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
		for(int i =0;i<list.size();i++) {
			Course c1 = list.get(i);
			if(c1.getId() == course.getId()) {
				list.set(i, course);
				break;
			}
		}
		return course;
	}
	
}
