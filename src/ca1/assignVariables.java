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

public String[][] assignStudents(String file) {
try {
            //File file = new File("students.txt");
            //FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(new FileReader (file));
            while (br.readLine() != null) { //reads first line
            name = br.readLine();
            int indexOfSpace = name.indexOf(" ");
            String firstName =  name.substring(0,indexOfSpace);
            String secondName =  name.substring((indexOfSpace+1));
            if (!firstName.matches("[A-Za-z]+")) {
                System.out.println("The first name must contain only letters");
            } else {
                System.out.println("The first name's format is correct");
            }  
            if (!secondName.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("The second name must contain letters and / or numbers");
            } else {
                System.out.println("The first name's format is correct");
            }  
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
                Students student = new Students(name, numClasses, studentNumber);
                studentList.add(student);
            }
            br.close();
            
            
        Students[] studentsArray = new Students[studentList.size()];
        studentsArray = studentList.toArray(studentsArray);
        
        
        String[][] studentDataArray = new String[studentList.size()][3];
        for (int i = 0; i < studentList.size(); i++) {
            Students student = studentList.get(i);
            studentDataArray[i][0] = student.getStudentName();
            studentDataArray[i][1] = student.getNumberOfClasses();
            studentDataArray[i][2] = student.getStudentNumber();
        }
 // checking if it worked
        for (Students student : studentsArray) {
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Number of Classes: " + student.getNumberOfClasses());
            System.out.println("Student Number: " + student.getStudentNumber());
            System.out.println(); // Print an empty line for better readability
        }
            
        } catch (IOException e) {
            System.out.println(e);
        } return null;
        
        
} 

        

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* 
  
ArrayList<Students> AllStudents = new ArrayList<>();
  
public String name;
public String numClasses;
public String studentNumber;
public String line = ""; 
public int length = 0;

public int findLength (String fileName) throws FileNotFoundException, IOException {
     try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
          while (reader.readLine() != null) length++;
          System.out.println(length);
      } catch (IOException e) {
          e.printStackTrace();
      }
      return length;

  }


public String[][] all_students = new String[length][3];
        
public String[][] assignStudents() {
       for (int row=0; row<all_students.length; row++) {
            System.out.println(all_students[row]);
            for (int col=0; col<all_students[row].length; col++) {
                System.out.println(all_students[row][col]);
                System.out.println(all_students[0][2]);
            }
        }
    
return all_students;
}


public void findStudents (String fileName) throws FileNotFoundException {
Scanner scanner = new Scanner(new File(fileName));

    
int line = 1;
while (scanner.hasNextLine()) {
    if (line % 3 == 1) {
        name = scanner.nextLine();
    } else if (line % 3 == 2) {
        numClasses = scanner.nextLine();
    } else if (line % 3 == 0) {
        studentNumber = scanner.nextLine();
        
        Students Student = new Students(name, numClasses, studentNumber);
        //need to add objects to the multi-dimmensional array
         AllStudents.add(Student);
    } 
    line++;
}
scanner.close();

/*
for (int row=0; row<all_students.length; row++) {
            System.out.println(all_students[row]);
            for (int col=0; col<all_students[row].length; col++) {
                System.out.println(all_students[row][col]);
                System.out.println(all_students[0][2]);
            }
        }


      public String findStudentByName (String name, ArrayList<Students> AllStudents){
        for (Students St : AllStudents){
            if(St.getStudentName().equalsIgnoreCase(name)) return St;
        }
      return null;
    }  
    
}
*/


