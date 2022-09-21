/** ****************************************************************************
 * StudentList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of students.
 **************************************************************************** */
package ch16writingandreadingobjects;

import java.util.*;

public class StudentList {

    ArrayList<String> students = new ArrayList<>();

    //**************************************************************************
    public StudentList(String[] names) {
        for (int i = 0; i < names.length; i++) {
            students.add(names[i]);
        } // end for loop
    } // end constructor
    //**************************************************************************

    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " ");
        } // end for loop
        System.out.println();
    } // end display method
    //**************************************************************************

    public void removeStudent(int index) {
        students.remove(index);
    } // end removeStudent method
} // end StudentList class
