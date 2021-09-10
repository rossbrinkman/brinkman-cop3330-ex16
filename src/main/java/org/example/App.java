package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        final int drivingAge = 16;
        int ageInput;

        System.out.println( "What is your age? " );
        ageInput = scanner.nextInt();

        String message = (ageInput >= drivingAge) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(message);
    }
}
