/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.console;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class assignVariables {

       List<Students> studentList = new ArrayList<>();
      
    
    
public String[][] assignStudents(String file) {

 
try {
           String name; 
            //File file = new File("students.txt");
            //FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(new FileReader (file));
        while ((name = br.readLine()) != null) { //reads first line
            //name = br.readLine();
            name = name.trim(); // Remove whitespaces
            String numClasses = br.readLine();  //reads second line
            if (numClasses == null) { 
            System.out.println("Incomplete data after student name: " + name);
            break;
                }
            String studentNumber = br.readLine(); // Read third line (student number)
            if (studentNumber == null) {
            System.out.println("Incomplete data after number of classes for student: " + name);
            break;
            } 
                    

        // A constructor that takes student name, number of classes, and student number
   
               Students newStudent = new Students(name, numClasses, studentNumber);
                studentList.add(newStudent);
                
                
                   Students[] studentsArray = new Students[studentList.size()];
   Students[] studentsArray2 = studentList.toArray(studentsArray);
        
         String[][] studentDataArray = new String[studentList.size()][3];
                
                 for (int i = 0; i < studentList.size(); i++) {
            //assignVariables student = studentList.get(i);
            newStudent = studentList.get(i);
            studentDataArray[i][0] = newStudent.getStudentName();
            studentDataArray[i][1] = newStudent.getNumberOfClasses();
            studentDataArray[i][2] = newStudent.getStudentNumber();
        }
        
      //  return studentDataArray;
 // checking if it worked
        for (Students student : studentList) {
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Number of Classes: " + student.getNumberOfClasses());
            System.out.println("Student Number: " + student.getStudentNumber());
            System.out.println(); // Print an empty line for better readability
        }
        
                
                 }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        } return null;
} 
      
            /*
   Students[] studentsArray = new Students[studentList.size()];
   Students[] studentsArray2 = studentList.toArray(studentsArray);
        
         String[][] studentDataArray = new String[studentList.size()][3];
        

        for (int i = 0; i < studentList.size(); i++) {
            //assignVariables student = studentList.get(i);
            Students student = studentList.get(i);
            studentDataArray[i][0] = student.getStudentName();
            studentDataArray[i][1] = student.getNumberOfClasses();
            studentDataArray[i][2] = student.getStudentNumber();
        }
        
      //  return studentDataArray;
 // checking if it worked
        for (Students student : studentsArray2) {
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Number of Classes: " + student.getNumberOfClasses());
            System.out.println("Student Number: " + student.getStudentNumber());
            System.out.println(); // Print an empty line for better readability
        }
*/
            
  // checking if it worked
  
        
} 

        


    