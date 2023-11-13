
package com.mycompany.jpa;

import com.mycompany.jpa.logic.Degree;
import com.mycompany.jpa.logic.Manager;
import com.mycompany.jpa.logic.Student;
import java.util.ArrayList;
import java.util.Date;

public class Jpa {

    public static void main(String[] args) {
                

        Manager controller = new Manager();
        
        
            //CREATE STUDENT

//        controller.createStudent(std);
    
            //DELETE STUDENT    

//        controller.deleteStudent(30);

            //FIND ALL STUDENTS

//        ArrayList<Student> st = controller.findAllStudents();
//        for (Student student : st) {
//        System.out.println(student.toString());
//        }
//        System.out.println("Results : " + st.size());
 
            //FIND STUDENT FOR ID
        
//        Student oneSt = controller.findStudent(30);
//        System.out.println(oneSt.toString());  


            //CREATE NEW DEGREE UNIVERSITY

    Degree degree = new Degree(1, "Law");
    
            //SAVE DEGREE IN BD

//       controller.createDegree(degree);
//       Degree degree = controller.findDegree(1);
    
            //CREATE STUDENT WITH DE NEW ENTITY "DEGREE"

    Student student = new Student(21, "Jane", "Alvarez", new Date(), degree);
    
            //SAVE STUDEN IN BD
    controller.createStudent(student);

            //SHOW RESULTS

//    System.out.print("RESULTS");
//    System.out.print(controller.findStudent(30));
    
    
    }
}
