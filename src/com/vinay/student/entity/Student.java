/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.student.entity;

import java.util.Scanner;

/**
 *
 * @author Leviathan
 */
public class Student {
    public int id;
    String firstName,lastName,email;
    
    Scanner sc = new Scanner(System.in);
    
    public void program(){
        setFirstName();
        setLastName();
        setEmail();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        System.out.println("Enter First Name: ");
        firstName=sc.next();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.println("Enter Last Name: ");
        lastName=sc.next();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.println("Enter email: ");
        email=sc.next();
    }
    
}
    
    