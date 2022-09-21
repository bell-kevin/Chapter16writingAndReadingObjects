# Chapter16writingAndReadingObjects

In this project, you will practice writing objects to a file, then reading objects from a file. This is a little different than writing and reading plain text. Create a project that has a StudentList class that can be written to a file. Instantiate an object of that class. Write that object to a file; modify it, display it with changes, and write it to the file; then modify it again, display it with those changes, and write it to the file. So the same object is written to the file 3 times, and all 3 versions of that object should be in the file when done. To check that, read all 3 objects from the file and display each one.

Start with the code for the StudentList class from Chapter 15 shown in Fig 15.8 on p. 673. Modify it so that objects in this class can be written to a file. In the driver class, create the first object with those names shown in the StudentListDriver code in Figure 15.9 on p. 674. Using the WriteObject class in Fig. 16.5 on p. 719 as a guide, write the StudentList object to a file named ThreeLists.txt. Modify the StudentList object to add the additional names of “Anna”, “James”, and “Noah”; display the object to show the changes are there, then write the modified object to the file. Modify the StudentList object again to remove the names “Usha” in position 1 and “Izumi” in position 3; display the object to show the changes are there, then write the modified object to the file. Next, read the objects from the file and display them.

Here is a sample session:

Ch 16 Writing Reading Objects

Note 1: Remember that there is only one StudentList object, which is being modified and then written to the file. Pay careful attention to the section on p. 721 about writing an updated version of a previously written object.

Note 2: When removing names from the StudentList object, you need to provide the integer that specifies the position for the name to be removed. If you remove the name in position 1 first, then all the following names will move up in the ArrayList and have a new index number. The index for the second name to remove is no longer position 3 as given in these instructions. When there are only a few deletions, you can easily do the math to determine the new changed index of the next name to be deleted.. But if you had a longer list and had deleted several items in the list, it gets more and more complicated to know exactly the index value of a given element without doing a search. If you know you have multiple elements to remove, delete them starting at the highest index value first. Deleting the element at index 3 renumbers everything with a higher index, but has no effect on the elements with a lower index. If you delete the element at index 3 first, then you can delete the element at index 1 next, and it will still be the specified element.

Take a screenshot that matches the sample session.

 

Submission:the specified screenshots and the root folder for the project

 

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
