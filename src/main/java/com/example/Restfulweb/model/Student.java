package com.example.Restfulweb.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.processing.Generated;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String name;
    @Column
    int sem;
    @Column
    int avg;

    public Student(){}

    public Student(int id, String name, int sem, int avg){
        super();
        this.id=id;
        this.name=name;
        this.sem=sem;
        this.avg=avg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }

    public int getAvg() {
        return avg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }
}
