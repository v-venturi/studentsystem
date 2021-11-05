package com.dev.studentsystem.repository;

import com.dev.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Integer> {

}
