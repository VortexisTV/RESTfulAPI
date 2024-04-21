package com.example.StudentApplication.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Phone {
    public String mob;

    public Phone() {
        // Default constructor
    }

    public Phone(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
