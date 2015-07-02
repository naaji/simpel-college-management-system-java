/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication158;

public class Student { //begin class



    public int studentID;

    int credits;

    int points;

    double gpa;
    private double gba;





  

public void setID(double ID)

{

    ID = studentID;





}

public int getID()

{

    return studentID;

}

public void setCredits(int credit)

{

    credit = credits;



}

public int getCredits()

{

    return credits;

}

public void setPoints(int point)

{



    point = points;

}

public double getPoints()

{

    return points;

}

public double calculateGPA(double gradepoint,int point,int credit)

{

    gradepoint = points/credits;

    return gradepoint;



}



    double calculateGPA(double points, int credits) {
        gba=points/credits;
        
        return gba;
  
    }





}//end class
