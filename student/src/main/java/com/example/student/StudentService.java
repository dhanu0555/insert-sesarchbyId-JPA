package com.example.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{

    @Autowired
    private  final UserRepository userRepository;
    public StudentService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  StudentData saveUser(StudentData user)
    {
        return userRepository.save(user);
    }
    public  List<StudentData> getAllUsers()
    {
        return userRepository.findAll();
    }
    public StudentData getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}

