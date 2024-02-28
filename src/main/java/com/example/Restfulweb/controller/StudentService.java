package com.example.Restfulweb.controller;

import com.example.Restfulweb.StudentRepository;
import com.example.Restfulweb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    List<Student> students=new ArrayList<>();

    public void createStudents(){
        students.add(new Student(1,"abc",7,11));
        students.add(new Student(2,"ghi",6,12));
        students.add(new Student(3,"jkl",5,13));
        students.add(new Student(4,"def",8,14));
    }

    public List<Student> getStudents() {
        createStudents();
        return studentRepository.findAll();
    }

    public Student findStudent(int id){
        Student student=students.stream().filter(s->s.getId()==id).findFirst().get();
        return student;
    }

    public void addStudent(Student student){
        studentRepository.save(student);
        System.out.println("Added a student");
    }
}
