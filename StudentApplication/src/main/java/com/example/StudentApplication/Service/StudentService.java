package com.example.StudentApplication.Service;

import com.example.StudentApplication.Entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student s);
    List<Student> getAllStudents();
    Student getStudentByID(int id);

    Student updateStudent(Student student);
    List<Student> deleteStudent(int id);
}
