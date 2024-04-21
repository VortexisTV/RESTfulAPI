package com.example.StudentApplication.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;



import java.util.List;


public class Student {


    public int id;

    public String name;


    public String ph;


    public Address add;

    public Student() {
    }

    public Student(int id, String name, String ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }


}
