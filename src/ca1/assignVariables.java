/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class assignVariables {
    ArrayList<Students> AllStudents = new ArrayList<>();
  
    String name;
    String numClasses;
    String studentNumber;

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
        AllStudents.add(Student);
        System.out.println(AllStudents.get(0));
        
    } 
    line++;
}
scanner.close();
}
    
    
}