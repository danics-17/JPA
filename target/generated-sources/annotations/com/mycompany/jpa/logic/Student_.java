package com.mycompany.jpa.logic;

import com.mycompany.jpa.logic.Degree;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-09T00:10:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> lastName;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Degree> degree;
    public static volatile SingularAttribute<Student, Integer> id;
    public static volatile SingularAttribute<Student, Date> birdDate;

}