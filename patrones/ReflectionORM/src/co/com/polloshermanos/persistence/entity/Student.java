/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.polloshermanos.persistence.entity;

import co.com.polloshermanos.persistence.orm.Column;
import co.com.polloshermanos.persistence.orm.Id;
import co.com.polloshermanos.persistence.orm.Table;

/**
 *
 * @author amesa
 */
@Table(name = "ESTUDIANTE")
public class Student {

    public Student(int id, String name, String lastName, String course) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }
    
    @Id
    @Column(name = "IDENTIFICADOR")
    public int id;
    
    @Column(name = "NOMBRE")
    public String name;
    
    @Column(name = "APELLIDO")
    public String lastName;
    
    @Column(name = "CURSO")
    public String course;

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", course=" + course + '}';
    }
}
