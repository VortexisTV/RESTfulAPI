package com.example.StudentApplicationwithDB.Service;

import com.example.StudentApplicationwithDB.DAO.StudentDAO;
import com.example.StudentApplicationwithDB.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudents() {
        return this.studentDAO.findAll();
    }

    @Override
    public Student getStudentByID(int id) {
        Optional<Student> s = this.studentDAO.findById(id);
        Student student = null;
        if(s.isPresent())
        {
            student=s.get();
        }
        else {
            throw new RuntimeException("Student Not Found :"+id);
        }

        return student;
    }



    @Override
    public Student addStudent(Student student) {
        return this.studentDAO.save(student);
    }

    @Override
    public Student updateStudent(Student student) {

        return this.studentDAO.save(student);
    }

    @Override
    public String deleteStudent(int id) {
       this.studentDAO.deleteById(id);
       return "Deleted Successfully";
    }
}
