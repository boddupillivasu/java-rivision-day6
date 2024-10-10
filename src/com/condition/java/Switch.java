package com.condition.java;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day:");
        String days = scanner.nextLine();


        switch (days) {

            case "monday":
                System.out.println("gym");
                break;// break statement used for terminate and cuts the current statement
            case "tuesday":
                System.out.println("college");
                break;

            case "wednesday":
                System.out.println("playing cricket");
                break;
            case "thursday":
                System.out.println("working day");
                break;
            case "friday":
                System.out.println("studying");
                break;
            case "saturday":
                System.out.println("weekend");
                break;
            case "sunday":
                System.out.println("holiday");
                break;
            default:
                System.out.println("invalid day");

        }

    }
}

