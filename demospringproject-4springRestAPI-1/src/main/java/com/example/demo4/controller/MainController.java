package com.example.demo4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.model.Course;
import com.example.demo4.model.Student;
import com.example.demo4.repository.CourseRepository;
import com.example.demo4.repository.StudentRepository;

@RestController
public class MainController {
	
	@Autowired
	private StudentRepository studentRepository;
	
    @Autowired
	private CourseRepository courseRepository;
	
	
	//testing purposes
	
	@GetMapping("/")
	public String Hello() {	
		return "hello alien, I'm here to kill you.....!!!";	
	}
	
	// find all students
	
	@GetMapping("/students/all")
	public List<Student> getStudents() {	
		return studentRepository.findAll();
		
	}
	
	
	
	//find single student by id ( static)
	
	@GetMapping("/student/102")
	public Optional<Student> getStudent() {	
		return studentRepository.findById(102);
		
	}
	
	//find single student by id (dynamically > don't need to mentions specific id ) using @PathVariable
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int id) {
		return studentRepository.findById(id);
	}
	
	
	
	// find all courses
	
		@GetMapping("/courses/all")
		public List<Course> getCourses() {
			
			return courseRepository.findAll();
			
		}
		
		
		// find single course (dynamically)
		
		@GetMapping("/course/{id}")	
	    public Optional<Course> getCourse(@PathVariable("id") int id){
			
			return courseRepository.findById(id);
		}
		
		
		
		@PostMapping("/student/add")
		public Student addStudent(@RequestBody Student student) {
			return studentRepository.save(student);
		}
		
		@PostMapping("/course/add")
		public Course addCourse(@RequestBody Course course) {
			return courseRepository.save(course);
		}
		
		@PostMapping("/student/update")
		public Student updateStudent(@RequestBody Student student) {
			return studentRepository.save(student);
		}
		
		@PostMapping("/course/update")
		public Course updateCourse(@RequestBody Course course) {
			return courseRepository.save(course);
		}

		@GetMapping("/student/{id}/delete")
		public String deleteStudent(@PathVariable("id") int id) {
			try {
				studentRepository.deleteById(id);
			} catch (Exception ex) {
				return "Failed";
			}

			return "Successful";
		}


}