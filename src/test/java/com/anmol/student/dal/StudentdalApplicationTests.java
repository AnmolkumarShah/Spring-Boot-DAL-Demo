package com.anmol.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.anmol.student.dal.entities.Student;
import com.anmol.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	StudentRepository theStudentRepository;
	
	@Test
	public void testCreateStudent() {
		
		Student theStudent = new Student();
		theStudent.setName("Anmol");
		theStudent.setCourse("Java FSD");
		theStudent.setFee(100d);
		
		
		theStudentRepository.save(theStudent);		
	}
	
	@Test
	public void testFindStudent() {
		Optional<Student> theStudentOptional = theStudentRepository.findById(1l);
		Student theStudent = theStudentOptional.get();
		System.out.println(theStudent);
	}
	
	@Test
	public void testUpdateStudent() {
		 Optional<Student> theStudentOptional = theStudentRepository.findById(1l);
		 Student theStudent = theStudentOptional.get();
		 
		 theStudent.setFee(200d);
		 
		 theStudentRepository.save(theStudent);
	}
	
	@Test
	public void testDeleteStudent() {
		theStudentRepository.deleteById(1l);
	}

}
