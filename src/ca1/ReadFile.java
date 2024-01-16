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
int length = 0;
String[] name = new String[length];
String[] numClasses = new String[length];
String[] studentNumber = new String[length];

//Read file with results (week 1)
        public void numStudents (String fileName) {
            BufferedReader br = null;
    try {
        //parsing a CSV file into BufferedReader class constructor
        br = new BufferedReader(new FileReader(fileName));
        while ((line = br.readLine()) != null) {
            length +=1;
        }
        // test if the code works
        System.out.println(length); 
    } catch (FileNotFoundException ex) {
        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("The students file is not found");

    } catch (IOException ex) { 
        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("The students file is not readable");
    }
        }
        
        public void declareVariables(String fileName) {
                    BufferedReader br = null;
    try {    
        br = new BufferedReader(new FileReader(fileName));
        int [] mod = new int[length];
            for (int i = 0; i<length; i++) {
            mod[i] = i % 3;
            if ((mod[i] == 0) || (i==0)) {
            name[i] = br.readLine();
            } else if ((mod[i] == 1) || (i==1)) {
            numClasses[i] = br.readLine();
            } else {
            studentNumber[i] = br.readLine();
            }
        //System.out.println(numClasses[1]);
        }
     //  return name{}; 

    } catch (FileNotFoundException ex) {
        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("The students file is not found");

    } catch (IOException ex) { 
        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("The students file is not readable");
    }
 //  return numClasses[0];
        }

}




/*
[] {{student1}, {student2}}

int[] array = new int[length];
while (sc.hasNext() == true) {
array[i] = sc.readLine();
sout()


            String [] name = {br.readLine() }
            String numClasses = br.readLine();
            String studentNumber = br.readLine();  
}
*/
