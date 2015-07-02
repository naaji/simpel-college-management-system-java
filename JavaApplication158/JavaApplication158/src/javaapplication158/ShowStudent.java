/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication158;
import org.junit.Test;
import static org.junit.Assert.*;
public class ShowStudent { //begin class



    public static void main(String[] args)

{



//Create student object

Student student1 = new Student();

//Set student parameters

student1.credits=10;

student1.points=4;

student1.studentID=1222;

//Calculate GPA and assign to variable

        double gradepoint = student1.calculateGPA(student1.getPoints(), student1.getCredits());



//Print results

System.out.println("Student ID: " + student1.getID());

System.out.println("Number of credits: " + student1.getCredits());

System.out.println("Number of points: " + student1.getPoints());

System.out.println("GPA: " + gradepoint);


  
 
junit.textui.TestRunner.run(student1.calculateGPA(gradepoint, point, credit));
}//End main method



}//end class