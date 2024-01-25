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
import java.io.PrintWriter;
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
            // assigning values to lines in the text file (non-validated)
            BufferedReader br = new BufferedReader(new FileReader (file));
        while ((name = br.readLine()) != null) { //reads first line
            name = name.trim(); // Remove whitespaces
            numClasses = br.readLine();  //reads second line
            studentNumber = br.readLine(); // Read third line (student number)
            
            if (numClasses == null || studentNumber == null) { 
            System.out.println("Incomplete data after student name: " + name);
            continue;
                }

        // validating the data     
            List<String> validationErrors = dataValidation(name, numClasses, studentNumber);
        if (validationErrors.isEmpty()) { // if there are no errors
            Students newStudent = new Students(name, numClasses, studentNumber);
            studentList.add(newStudent); // we add the student (no errors)
            String[][] studentDataArray = new String[studentList.size()][3]; //store students in an 2D array
        
        // assign variables to each student    
        for (int i = 0; i < studentList.size(); i++) {
            newStudent = studentList.get(i);
            studentDataArray[i][0] = newStudent.getStudentName();
            studentDataArray[i][1] = newStudent.getNumberOfClasses();
            studentDataArray[i][2] = newStudent.getStudentNumber();
        }
        // output in case there are errors
        } else {
            for (String error : validationErrors) {
                System.out.println(error);
            }
            continue;
        }
    }

    outputToFile(studentList);        
        /*
checking if assigning values worked: I run this, and commented out when I saw it worked,
because this is not requested in the CA 
        
        for (Students student : studentList) {
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Number of Classes: " + student.getNumberOfClasses());
            System.out.println("Student Number: " + student.getStudentNumber());
            System.out.println(); // Print an empty line for better readability
        }
*/
            br.close();
        } catch (IOException e) { // file exception handling
            System.out.println(e);
            e.printStackTrace();
        } return null;  
}
        

// method to validate the data (where the errors messages are coded)
public List<String> dataValidation(String name, String numClasses, String studentNumber) {
    List<String> errors = new ArrayList<>();

int indexOfSpace = name.indexOf(" ");
    if (indexOfSpace == -1) { //finding the space
        errors.add("Invalid format: name does not contain a space");
            }
            String firstName =  name.substring(0,indexOfSpace); //finding First Name
            String secondName =  name.substring(indexOfSpace+1); //finding Second Name
    if (!firstName.matches("[A-Za-z]+")) {
                errors.add("The first name must contain only letters");        
            } else if (!secondName.matches("^[a-zA-Z0-9]+$")) {
                errors.add("The second name must contain letters and / or numbers");  
            }
    if ((!numClasses.matches("[1-8]")) ) {
        errors.add("The number of classes must contain numbers 1-8");          
            }
    
    // This is to handle the student number
    studentNumber = studentNumber.trim(); // Remove whitespaces
    String firstPartStudentNumber = studentNumber.substring(0,2);
    String secondPartSN1 = studentNumber.length() > 2 ? studentNumber.substring(2, 4) : ""; //(former code) studentNumber.substring(2,3);
    String secondPartSN2 = studentNumber.length() > 2 ? studentNumber.substring(2, 4) : ""; 
    String lastPartTrigger = studentNumber.length() > 4 ? studentNumber.substring(4, 5) : "";
    String lastPartSN = null;
    int reasonableYear = 20;
    //handling first part of Student Number
    if (studentNumber.length() <= 6) {
        errors.add("The student number must be at least 6 characters long");//
        // starts by 20 or higher (2020)
            } else if (!firstPartStudentNumber.matches("[0-9]+")) {
                errors.add("The student number must start with 2 numbers"); 
            } else if (Integer.parseInt(firstPartStudentNumber) < reasonableYear) {  
            errors.add("The student number must start with a number higher than " +reasonableYear);
    //handling second part of Student Number            
            } else if ((!secondPartSN1.matches("[A-Za-z]+")) || (!secondPartSN2.matches("[A-Za-z]+"))) {
               errors.add("The 3rd, 4rd - and sometimes the 5th character too - of the student number must be letters");
            }

    //handling last part of Student Numbe
    int reasonableNum1 = 1;
    int reasonableNum2 = 200;
    if (lastPartTrigger.matches("[A-Za-z]+")) { // if the middle part has 3 letters
            lastPartSN = studentNumber.substring(5,8); // last part starts at the 6th
            } else if (lastPartTrigger.matches("[0-9]+")) { // if the middle part has 3 letters
            lastPartSN = studentNumber.substring(4, 7);// last part starts at the 6th
            }
    if (!lastPartSN.matches("[0-9]+")){
                    errors.add("The last part of the student number must be numbers");
    } else if ((Integer.parseInt(lastPartSN)<reasonableNum1)||(Integer.parseInt(lastPartSN) > reasonableNum2)  ){
                     errors.add("The last part of the student number must be between "+reasonableNum1+" and "+reasonableNum2);
                } 
            
return errors; 
}
 

public void outputToFile(List<Students> studentList) {
    try (PrintWriter writer = new PrintWriter("status.txt")) {
        for (Students student : studentList) {
            String workload = determineWorkload(student.getNumberOfClasses());
            String secondName = getSecondName(student.getStudentName());
            writer.println(student.getStudentNumber() + " - " + secondName);
            writer.println(workload);
        }
    } catch (IOException e) {
        System.out.println("An error occurred while writing to the file: " + e.getMessage());
    }
}

private String determineWorkload(String numClassesStr) {
    int numClasses = Integer.parseInt(numClassesStr);
    if (numClasses == 1) {
        return "very light";
    } else if (numClasses == 2) {
        return "light";
    } else if (numClasses >= 3 && numClasses <= 5) {
        return "part time";
    } else if (numClasses >= 6 && numClasses <= 8) {
        return "full time";
    } else {
        return "unknown"; // Or any other default value
    }
}

private String getSecondName(String fullName) {
    int indexOfSpace = fullName.lastIndexOf(" ");
    return indexOfSpace != -1 ? fullName.substring(indexOfSpace + 1) : "";
}


}
        
 


        


        


    