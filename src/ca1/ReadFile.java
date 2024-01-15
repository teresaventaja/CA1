/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ReadFile {
            
String line = "";

//Read file with results (week 1)
        public String readStudents (String fileName) {
            BufferedReader br = null;
    try {
        //parsing a CSV file into BufferedReader class constructor
        br = new BufferedReader(new FileReader(fileName));
        while ((line = br.readLine()) != null) {
            String firstStudent = ;    
            String name = br.readLine();
                String numClasses = br.readLine();
                String studentNumber = br.readLine();  
        }
        return ""; 
    } catch (FileNotFoundException ex) {
        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("The students file is not found");

    } catch (IOException ex) { 
        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("The students file is not readable");
    }
return ""; 
        } 
}

/*
[] {{student1}, {student2}}

int[] array = new int[length];
while (sc.hasNext() == true) {
array[i] = sc.readLine();
sout()
}
*/
