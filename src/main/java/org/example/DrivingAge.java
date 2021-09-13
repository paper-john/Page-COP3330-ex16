package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class DrivingAge
{
    public static void main( String[] args )
    {
        //declare variables
        int age;
        String result;
        Scanner input = new Scanner(System.in);

        //Get user age
        System.out.print("What is your age? ");
        age = input.nextInt();

        //Display result
        result = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(result);
    }
}
