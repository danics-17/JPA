package com.mycompany.jpa.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic 
    private String name;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birdDate;

    @OneToOne
    private Degree degree;
    
    public Student() {
    }

    public Student(int id, String name, String lastName, Date birdDate, Degree degree) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birdDate = birdDate;
        this.degree = degree;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirdDate() {
        return birdDate;
    }

    public void setBirdDate(Date birdDate) {
        this.birdDate = birdDate;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birdDate=" + birdDate + '}';
    }
}
