/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.polloshermanos.persistence.dao;

import co.com.polloshermanos.persistence.entity.Student;
import co.com.polloshermanos.persistence.orm.ContextPersistence;
import co.com.polloshermanos.persistence.orm.PersistenceManager;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PersistenceDAO {
    
    @ContextPersistence(name = "workshop4")
    private PersistenceManager pm;
    
    public void executeExcersice(){
        Student std1 = new Student(10, "Juan", "Guerrero", "AES-Patrones");
        Student std2 = new Student(11, "Camilo", "Romero", "AES-Patrones");
        Student std3 = new Student(12, "Alejandro", "Lopez", "AES-Patrones");
        Student std4 = new Student(13, "Alejandro", "Mesa", "AES-Patrones");
        
        pm.persist(std1);
        pm.persist(std2);
        pm.persist(std3);
        pm.persist(std4);
        
        List<Student> students = pm.listAllStudents();
        if(students != null){
            students.forEach((s) -> {
                System.out.println(s);
            });
        }
    }
    
}
