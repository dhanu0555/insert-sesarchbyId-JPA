package com.example.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private final StudentService userService;
    public StudentController(StudentService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<StudentData> createUser(@RequestBody StudentData user) {
        StudentData savedUser = userService.saveUser(user);
        return new ResponseEntity<StudentData>(savedUser, HttpStatus.OK);
    }
    //   @GetMapping("/{id}")
   // public StudentData getUserById(@PathVariable Long id) {
     //   return userService.getUserById(id);
    ///}
    @GetMapping("/users")
    public List<StudentData> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public StudentData getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
