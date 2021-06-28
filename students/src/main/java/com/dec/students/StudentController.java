package com.dec.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    RepositoryStudent repositoryStudent;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repositoryStudent.findAll();
    }

    @PostMapping
    public Student addUser(@RequestBody Student student){
        repositoryStudent.save(student);
        return student;
    }
}
