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
 * @author User
 */
public class CA1 {


    public static void main(String[] args) throws FileNotFoundException {

        // Instanciating classes
        assignVariables operation = new assignVariables();
        get_user_input console = new get_user_input();
        
        // Getting user input (console menu)
        String userInput = console.askString("Introduce the word <Standard> to transfer students from a file, or the word <Manual> to add a student manually");
        if ("Standard".equals(userInput)) {   
//-----------------READING FILE, VALIDATING CONTENT, AND ASSIGNING VALUES-------------
//-----------------OUTPUT IN A NEW FILE, TRANSFORMING THE DATA-------------
        operation.assignStudents("students.txt");
        System.out.println("Valid students moved to the new file");
        } else if ("Manual".equals(userInput)) {
//-----------------MANUAL INPUT IN THE FILE, TRANSFORMING THE DATA-------------
        int howManyStudents = console.askInt("How many students do you want to add manually?");
        for (int i = howManyStudents; i>0; i--) {
        operation.addStudentManually();
        }
        System.out.println("All valid students added manually");
        } else {
        System.out.println("Incorrect input. Please, introduce <Standard> or <Manual>");
        }

    }
    
}
