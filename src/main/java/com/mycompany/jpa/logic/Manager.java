
package com.mycompany.jpa.logic;

import com.mycompany.jpa.persistence.PersistanceController;
import java.util.ArrayList;


public class Manager {
    
    PersistanceController persistanceController = new PersistanceController();
    
    
    // STUDENT
    
    public void createStudent(Student student){
        
        persistanceController.createStudent(student);
    }
    
    public void deleteStudent(int id){
        
        persistanceController.deleteStudent(id);
    }
    
    public Student findStudent(int id){
        return persistanceController.findStudent(id);
    } 
    
    public ArrayList<Student> findAllStudents() {
        
        return persistanceController.findAllStudents();
    }

    // DEGREE
    
    public void createDegree (Degree degree){
        
       persistanceController.createDegree(degree); 
    }
    
    public void deleteStudend(int id){
       
       persistanceController.deleteDegree(id);
    }
    
    public Degree findDegree(int id){
       return persistanceController.findDegree(id);
    }
    
    public ArrayList<Degree> findAllDegree(){
        return  persistanceController.findAllDegree();
    }  
}
    
