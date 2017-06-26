package com.company;

/*
Ask the user to enter teh number of sides for a pair of dice.
Prompt the user to roll the dice.
Roll two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Grand Circus Casino");
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many sides should each die have?");
        int sides= scnr.nextInt();

        System.out.println("How many rolls");
        int numRolls= scnr.nextInt();

        System.out.println("Roll 1:");
        for (int i=1; i<=numRolls; )
        System.out.println(Math.random(0, sides));

    }
}
