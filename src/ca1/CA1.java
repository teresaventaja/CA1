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
 *
 * @author User
 */
public class CA1 {

    /**
     * Github: https://github.com/teresaventaja/CA1
     * When in operation, the program will be given a file named “students.txt” – this contains the details of (fictitious) students in the following format: 

Line 1 – First Name> second Name>
Line 2 – Number of classes>
Line 3 – Student number>

Your task is to: 
1)	Read the data from the file and check that it is valid. The file may contain more than one student, so an appropriate loop should be used. The data must obey the following rules: 
a)	the first name must be letters only; 
b)	The second name can be letters and/or numbers and must be separated from the first name by a single space; 
c)	the number of classes must be an integer value between 1 and 8 (inclusive), and 
d)	the student “number” must be a minimum of 6 characters with the first 2 characters being numbers, the 3rd  and 4th characters (and possibly 5th ) being a letter, and everything after the last letter character being a number.
2)	If the data is not valid, you should output a useful error message on screen to the user.
3)	If the data is valid, then you have to output the data to a file named status.txt, in the following format:
Student number> - Second Name>
Workload>

     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
 
        assignVariables firstAttempt = new assignVariables();        
        firstAttempt.assignStudents("students.txt");
        
        /*
        ArrayList<Students> AllStudents = new ArrayList<>();
        assignVariables firstAttempt = new assignVariables();
        firstAttempt.findStudents("students.txt");
        
        
        */

        

        
    }
    
}
