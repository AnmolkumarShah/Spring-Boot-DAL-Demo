package com.anmol.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.anmol.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
