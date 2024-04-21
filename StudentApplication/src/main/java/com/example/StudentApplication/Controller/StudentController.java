package com.example.StudentApplicationwithDB.Controller;

import com.example.StudentApplication.Entity.Student;
import com.example.StudentApplication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to Student Application</h1>";
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return this.ss.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.ss.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getSingleStudent(@PathVariable String id) {
        return this.ss.getStudentByID(Integer.parseInt(id));
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student) {
        return this.ss.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id) {
        return this.ss.deleteStudent(Integer.parseInt(id)).toString();
    }
}
