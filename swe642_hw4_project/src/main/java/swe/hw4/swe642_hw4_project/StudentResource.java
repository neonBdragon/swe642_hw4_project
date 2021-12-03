/*
 * Brandon Mack, Qingyang Dai
 * */

package swe.hw4.swe642_hw4_project;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import swe.hw4.swe642_hw4_project.model.Student;
import swe.hw4.swe642_hw4_project.service.StudentService;

//Manages all the resource mapping of HTTP requests

@RestController // Lets the server know it is a REST controller for handling services
@RequestMapping("/student")
public class StudentResource {
	private Logger LOGGER = Logger.getLogger(StudentResource.class.getName());
	private final StudentService studentService;
	
	public StudentResource(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		LOGGER.info("Student Resource: List Students");
		List<Student> students = studentService.findAllStudents();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@GetMapping("/find/{sid}")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("sid") Integer sid) {
		LOGGER.info("Student Resource: Find Student");
		Optional<Student> student = studentService.findStudent(sid);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		LOGGER.info("Student Resource: Add Student: " + student.toString());
		Optional<Student> findStudent = studentService.findStudent(student.getStudentCode());
		if(!findStudent.isEmpty())	{
			LOGGER.info("Found Student!");
			return new ResponseEntity<>(student, HttpStatus.OK);
		} else {
			LOGGER.info("Student not Found!");
			Student newStudent = studentService.addStudent(student);
			return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
		}
		
	}
}
