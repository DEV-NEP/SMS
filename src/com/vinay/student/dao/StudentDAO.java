/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.student.dao;
import com.vinay.student.entity.Student;
import java.util.ArrayList;
/**
 *
 * @author Leviathan
 */
public interface StudentDAO {
    
    void add(Student s);
    boolean delete(int id);
    ArrayList<Student> showAll();
    Student getById(int id);
    Student getByAny(Student s);
    
    
    
    
}
