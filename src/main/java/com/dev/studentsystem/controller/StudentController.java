package com.dev.studentsystem.controller;

import com.dev.studentsystem.model.Student;
import com.dev.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student has added";
    }
    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }


}
