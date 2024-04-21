package com.example.StudentApplicationwithDB.Controller;

import com.example.StudentApplicationwithDB.Entity.Student;
import com.example.StudentApplicationwithDB.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService cs;

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to Student Application</h1>";
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return this.cs.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.cs.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getSingleStudent(@PathVariable String id) {
        return this.cs.getStudentByID(Integer.parseInt(id));
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student) {
        return this.cs.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id) {
        return this.cs.deleteStudent(Integer.parseInt(id));
    }
}
