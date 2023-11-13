package com.mycompany.jpa.persistence;

import com.mycompany.jpa.logic.Degree;
import com.mycompany.jpa.logic.Student;
import com.mycompany.jpa.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistanceController {
    
    StudentJpaController studentJpa = new StudentJpaController();
    DegreeJpaController degreeJpaController = new DegreeJpaController();

    public void createStudent(Student student) {
        studentJpa.create(student);
    }

    public void deleteStudent(int id) {
        try {
            studentJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Method for extrac only one student 
    public Student findStudent(int id) {
        return studentJpa.findStudent(id);
    }
    
    //Method for extrac all list of students in DB
    public ArrayList<Student> findAllStudents(){
        
        List<Student> listStudent = studentJpa.findStudentEntities();
        ArrayList<Student>  arrayListStudents = new ArrayList<Student>(listStudent);
        return arrayListStudents;
    }

    // DEGREE Methods
    
    public void createDegree(Degree degree) {
        degreeJpaController.create(degree);
    }

    public void deleteDegree(int id) {
        try {
            degreeJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Degree findDegree(int id) {
        return degreeJpaController.findDegree(id);
    }

    public ArrayList<Degree> findAllDegree() {
        List<Degree> list = degreeJpaController.findDegreeEntities();
        ArrayList<Degree> arrayList = new ArrayList<>(list);
        return arrayList;
    }
}
