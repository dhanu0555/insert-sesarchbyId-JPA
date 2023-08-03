package com.example.student;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    public StudentData(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public StudentData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}