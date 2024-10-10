package com.condition.java;

import java.util.Scanner;

public class ControlStatements {
    //public static void main(String[] args) {
    // here we discussed about  the student marks details

    /*
    suppose 90 for 100 he get A  grade
    or else 90<to >80 he get  B grade
     or else 80<to >60 he get  C grade
      or else 50<to >40 he get  D grade

      otherwise he must be fail

     */
    public void marks() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks of student:");
        int marks = scanner.nextInt();


        if (marks >= 90 && marks < 100) {
            System.out.println("A Grade:" + marks);
        } else if (marks < 90 && marks > 80) {

            System.out.println("B Grade:" + marks);
        } else if (marks < 80 && marks > 60) {

            System.out.println("c Grade:" + marks);
        } else if (marks < 60 && marks > 40) {

            System.out.println("D Grade:" + marks);
        } else if (marks < 40) {
            System.out.println("He Failed:" + marks);
        } else {
            System.out.println("invalid marks");
        }
    }

    public static void main(String[] args) {

        ControlStatements conditionStatements;
        conditionStatements = new ControlStatements();
        conditionStatements.marks();
    }
}
