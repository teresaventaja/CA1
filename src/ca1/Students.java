package ca1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Students {

    String name;
    String numClasses;
    String studentNumber;
    
    public Students(String name,String numClasses, String studentNumber) {
    this.name = name;
    this.numClasses = numClasses;
    this.studentNumber = studentNumber;
    }

    // Getters for the fields
    public String getStudentName() {
        return name;
    }
        
    public String getStudentNumber() {
        return studentNumber;
    }

    public String getNumberOfClasses() {
        return numClasses;
    }
      
}
