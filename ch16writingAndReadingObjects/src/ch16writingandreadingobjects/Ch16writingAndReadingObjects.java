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
        studentList.display();
    } // end main method
} // end Ch16writingAndReadingObjects class
