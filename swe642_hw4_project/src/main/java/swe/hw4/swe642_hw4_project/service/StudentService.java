package swe.hw4.swe642_hw4_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swe.hw4.swe642_hw4_project.model.Student;
import swe.hw4.swe642_hw4_project.repo.StudentRepo;

@Service
public class StudentService {
	private final StudentRepo studentRepo;
	
	@Autowired
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> findAllStudents() {
		return studentRepo.findAll();
	}
	
	public Optional<Student> findStudent(Integer scode) {
		return studentRepo.findStudentByScode(scode);
	}
	
	
}
