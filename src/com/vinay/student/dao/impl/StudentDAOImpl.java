/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.student.dao.impl;

import com.vinay.student.entity.Student;
import com.vinay.student.dao.StudentDAO;
import java.util.ArrayList;

/**
 *
 * @author Leviathan
 */
public class StudentDAOImpl implements StudentDAO{
    
    ArrayList<Student> stdList=new ArrayList<>();
    

    @Override
    public void add(Student s) {
        s.setId(stdList.size()+1);
        stdList.add(s);
         
        //System.out.println(id1);
        
        
    }

    @Override
    public boolean delete(int id) {
       
       for(Student s:stdList){
           if(s.getId()==id && s!=null){
           
            s=null;
            return true;
            
            }
    }
       return false;
    }
    
    @Override
    public ArrayList<Student> showAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        
        for(Student s:stdList){
            if(s.getId()==id && s!=null){
                return s;
            }
        
    }return null;
    }

    @Override
    public Student getByAny(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
