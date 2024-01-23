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
3)	If the data is valid, I need to output the data to a file named myfile.txt, in the following format:
Student number - Second Name
Workload
* 
* The workload: if numClasses is 1, "very light"; if numClasses is 2, "light"; if numClasses is 1, "very light"; if numClasses is 3,4,5, "part time"; if numClasses is 6,7,8 "part time"; 
 * @author User
 */
public class CA1 {


    public static void main(String[] args) throws FileNotFoundException {

        // Instanciating assignVariables Class
        assignVariables firstAttempt = new assignVariables();
       
//-----------------READING FILE, VALIDATING CONTENT, AND ASSIGNING VALUES-------------
//-----------------OUTPUT IN A NEW FILE, TRANSFORMING THE DATA-------------
        
        // Calling assignStudents method
        firstAttempt.assignStudents("students.txt");


    }
    
}
