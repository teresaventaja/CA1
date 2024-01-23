/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Github: https://github.com/teresaventaja/CA1
     * When in operation, the program will be given a file named “students.txt” – this contains the details of (fictitious) students in the following format: 

Your task is to: 
1)	Read the data from the file and check that it is valid. The file may contain more than one student, so an appropriate loop should be used. The data must obey the following rules: 
2)	If the data is not valid, you should output a useful error message on screen to the user.
3)	If the data is valid, then you have to output the data to a file named status.txt, in the following format:
Student number> - Second Name>
Workload>
 * @author User
 */
public class CA1 {


    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
    //String name = null; 
   // String numClasses = null; 
   // String studentNumber = null; 
        assignVariables firstAttempt = new assignVariables();  
        firstAttempt.assignStudents("students.txt");
       // firstAttempt.dataValidation(name, numClasses, studentNumber);
        
       // firstAttempt.dataValidation();
  
    }
    
}
