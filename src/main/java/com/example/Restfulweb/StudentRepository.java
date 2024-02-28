package com.example.Restfulweb;

import com.example.Restfulweb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findById(int id);
    List<Student> findByName(String name);

//    void save(Student student)

    List<Student> findAll();
}
