package com.example.StudentApplicationwithDB.Service;

import com.example.StudentApplicationwithDB.Entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student s);
    List<Student> getAllStudents();
    Student getStudentByID(int id);

    Student updateStudent(Student student);
    String deleteStudent(int id);
}
