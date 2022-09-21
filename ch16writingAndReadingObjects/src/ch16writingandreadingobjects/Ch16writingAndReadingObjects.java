/** ****************************************************************************
 * Ch16writingAndReadingObjects.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package ch16writingandreadingobjects;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Ch16writingAndReadingObjects {

    public static void main(String[] args) {
        System.out.println("Chapter 16 Objects in Files by Kevin Bell \n");
        String[] names = {"Caleb", "Izumi", "Mary", "Usha"};
        StudentList studentList = new StudentList(names);
        System.out.println("List 1: ");
        studentList.display();
//******************************************************************************
        // write object
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.print("Enter fileName: ");
        String fileName = computerKeyboardInput.nextLine();
        try (ObjectOutputStream fileOut
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(studentList);
            fileOut.reset();
            studentList.addStudent("Anna");
            studentList.addStudent("James");
            studentList.addStudent("Noah");
        } // end try, and close fileOut automatically
        catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end catch block
    } // end main method
} // end Ch16writingAndReadingObjects class
