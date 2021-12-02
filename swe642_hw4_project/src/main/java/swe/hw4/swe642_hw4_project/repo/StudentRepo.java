package swe.hw4.swe642_hw4_project.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import swe.hw4.swe642_hw4_project.model.Student;

public interface StudentRepo extends JpaRepository<Student, Number>{

	Optional<Student> findStudentByScode(Integer scode);
}
