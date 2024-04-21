package com.example.StudentApplication.Service;

import com.example.StudentApplication.DAO.StudentDAO;
import com.example.StudentApplication.Entity.Address;
import com.example.StudentApplication.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    Address address = new Address("Minneapolis", "Minnesota", "USA", 31523);
    public List<Student> list;

    public StudentServiceImpl(List<Student> list) {
        list = new ArrayList<Student>();
        list.add(new Student(101,"Thomas","315-529-0523", address));
        list.add(new Student(102,"Mario","813-501-5903", address));
        list.add(new Student(103,"Bob","502-319-6003", address));
        this.list = list;
    }


    @Override
    public List<Student> getAllStudents() {
        return list;
    }

    @Override
    public Student getStudentByID(int id) {

        Student s = null;
        for(Student student:list)
        {
            if(student.getId()==id)
            {
                s=student;
                break;
            }
        }

        return s;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> deleteStudent(int id) {
        Student studentToRemove = null;
        for (Student student : list) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            list.remove(studentToRemove);
        }
        return list;
    }

    @Override
    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }

}
