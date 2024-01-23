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
    public String name; 
    public String numClasses; 
    public String studentNumber; 
    
    
public String[][] assignStudents(String file) {

 
try {
          // String name; 
            //File file = new File("students.txt");
            //FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(new FileReader (file));
        while ((name = br.readLine()) != null) { //reads first line
            //name = br.readLine();
            name = name.trim(); // Remove whitespaces
            numClasses = br.readLine();  //reads second line
            if (numClasses == null) { 
            System.out.println("Incomplete data after student name: " + name);
            break;
                }
            studentNumber = br.readLine(); // Read third line (student number)
            if (studentNumber == null) {
            System.out.println("Incomplete data after number of classes for student: " + name);
            break;
            } 
                
            
            
            
            List<String> validationErrors = dataValidation(name, numClasses, studentNumber);
        if (validationErrors.isEmpty()) {
            Students newStudent = new Students(name, numClasses, studentNumber);
            studentList.add(newStudent);
        } else {
            for (String error : validationErrors) {
                System.out.println(error); // Print each error message
            }
            continue; // Skip to the next iteration since this student failed validation
        }
 
        
                       Students newStudent = new Students(name, numClasses, studentNumber);
                studentList.add(newStudent);
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
        
public List<String> dataValidation(String name, String numClasses, String studentNumber) {
    List<String> errors = new ArrayList<>();
    //boolean isValid = true;
int indexOfSpace = name.indexOf(" ");
    if (indexOfSpace == -1) {
        errors.add("Invalid format: name does not contain a space");
        
    //System.out.println("Invalid format: name does not contain a space");
            //continue; 
            }
            String firstName =  name.substring(0,indexOfSpace);
            String secondName =  name.substring(indexOfSpace+1);
    if (!firstName.matches("[A-Za-z]+")) {
                errors.add("The first name must contain only letters");        
       // System.out.println("The first name must contain only letters");
            } else if (!secondName.matches("^[a-zA-Z0-9]+$")) {
                errors.add("The second name must contain letters and / or numbers");  
                //System.out.println("The second name must contain letters and / or numbers");
            }
    if (!numClasses.matches("[0-9]+")) {
        errors.add("The number of classes must contain numbers");          
        //System.out.println("The number of classes must contain numbers");
            }
    studentNumber = studentNumber.trim(); // Remove whitespaces
    String firstPartStudentNumber = studentNumber.substring(0,1);
    String secondPartSN1 = studentNumber.length() > 2 ? studentNumber.substring(2, 3) : ""; //studentNumber.substring(2,3);
    String secondPartSN2 = studentNumber.length() > 2 ? studentNumber.substring(2, 4) : ""; //studentNumber.substring(2,4);
    String lastPartTrigger = studentNumber.length() > 4 ? studentNumber.substring(4, 5) : "";//studentNumber.substring(4,4);
    String lastPartSN;
    if (studentNumber.length() <= 6) {
        errors.add("The student number must be at least 6 characters long");
                //System.out.println("The student number must be at least 6 characters long");
            } else if (!firstPartStudentNumber.matches("[0-9]+")) {
               // System.out.println("The student number must start with 2 numbers");
                errors.add("The student number must start with 2 numbers");
            } else if ((!secondPartSN1.matches("[A-Za-z]+")) || (!secondPartSN2.matches("[A-Za-z]+"))) {
               errors.add("The 3rd, 4rd - and sometimes the 5th character too - of the student number must be letters");
               // System.out.println("The 3rd, 4rd - and sometimes the 5th character too - of the student number must be letters");
    if (lastPartTrigger.matches("[A-Za-z]+")) {
            lastPartSN = studentNumber.length() > 5 ? studentNumber.substring(5) : ""; //lastPartSN = studentNumber.substring(5);
                if (!lastPartSN.matches("[0-9]+")){
                     errors.add("The last part of the student number must be numbers");
   // System.out.println("The last part of the student number must be numbers");
    }
            } else if (lastPartTrigger.matches("[0-9]+")) {
                lastPartSN = studentNumber.length() > 4 ? studentNumber.substring(4) : ""; //   lastPartSN = studentNumber.substring(4);
                if (!lastPartSN.matches("[0-9]+")){
                    errors.add("The last part of the student number must be numbers");
    //System.out.println("The last part of the student number must be numbers");
    }
            }

}
        // Return true if data is valid, false otherwise
 // or false based on validation
    return errors; 
}
        
 

}
        


        


    