package com.example.Restfulweb.controller;

import com.example.Restfulweb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping(method=RequestMethod.POST, value="students")
    public void addStudent(@RequestBody Student student){
        System.out.println("Controllers add student");
        studentService.addStudent(student);
    }

    @RequestMapping("/student/{id}")
    public Student findStudent(@PathVariable int id){
        return studentService.findStudent(id);
    }
}
