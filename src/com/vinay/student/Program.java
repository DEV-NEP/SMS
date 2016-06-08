/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.student;

import com.vinay.student.dao.StudentDAO;
import com.vinay.student.dao.impl.StudentDAOImpl;
import com.vinay.student.entity.Student;

/**
 *
 * @author Leviathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student std=new Student();
      StudentDAO stdDAO= new StudentDAOImpl();
      std.program();
      stdDAO.add(std);
       // System.out.println(stdDAO.delete(1));
        System.out.println(stdDAO.getById(1));
    }
    
}
