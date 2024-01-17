/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
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
    String line = ""; 
    int length = 0;

public void findStudents (String fileName) throws FileNotFoundException {
    long lines = 0;
    lines = Files.lines("").count();
Scanner sc = new Scanner(new File(fileName));



/*
for (int row=0; row<array.length; row++) {
    System.out.println(Array[row]);
    for (int col = 0; col<array[arow].length;col++){
        System.out.println([row][col]);
    }

}
*/
while (sc.hasNextLine()) {
sc.nextLine();
length += 1;
}
System.out.println(length);

}
}
    

    
    /*
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
      public String findStudentByName (String name, ArrayList<Students> AllStudents){
        for (Students St : AllStudents){
            if(St.getStudentName().equalsIgnoreCase(name)) return St;
        }
      return null;
    }  
    
}
use length


length = 0;
while (scanner.hasNextLine()) {
length += 1;
}
System.out.println(length);
*/

