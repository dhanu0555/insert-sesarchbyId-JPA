package com.example.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<StudentData, Long> {
    // Custom queries or methods can be added here if needed

}
