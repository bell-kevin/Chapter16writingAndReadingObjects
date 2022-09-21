/** ****************************************************************************
 * Ch16writingAndReadingObjects.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package ch16writingandreadingobjects;

import java.io.*;

public class Ch16writingAndReadingObjects {

    public static void main(String[] args) {
        System.out.println("Chapter 16 Objects in Files by Kevin Bell \n");
        String[] names = {"Caleb", "Izumi", "Mary", "Usha"};
        StudentList studentList = new StudentList(names);
        System.out.println("List 1: ");
        studentList.display();
        String fileName = "ThreeLists.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(studentList);
            fileOut.reset();
            studentList.addStudent("Anna");
            studentList.addStudent("James");
            studentList.addStudent("Noah");
            fileOut.writeObject(studentList);
            fileOut.reset();
            System.out.println("List 2: added some names");
            studentList.display();
            studentList.removeStudent(1);
            studentList.removeStudent(2);
            fileOut.writeObject(studentList);
            fileOut.reset();
            System.out.println("List 3: removed some names");
            studentList.display();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            System.out.println("");
            System.out.println("Results of reading objects from file: ");
            while (true) {
                studentList = (StudentList) fileIn.readObject();
                studentList.display();
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end Ch16writingAndReadingObjects class
