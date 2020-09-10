package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner val = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Lets play (R)ock, (P)aper or (S)cissors!");

        String personPlay;
        String computerPlay;

        int randomNumber;

        randomNumber = generator.nextInt(3);

        if (randomNumber == 1) {
            computerPlay = "R";

        } else if (randomNumber == 2) {
            computerPlay = "P";

        } else {
            computerPlay = "S";

        }

        System.out.print("\nEnter your play: ");
        personPlay = val.next();

        System.out.println("Opponents play: " + computerPlay);

        if (personPlay.equalsIgnoreCase(computerPlay)) {
            System.out.println("Its a tie!");

        } else if (personPlay.equalsIgnoreCase("R") & computerPlay.equalsIgnoreCase("P")) {
            System.out.println("You lose...");

        } else if (computerPlay.equalsIgnoreCase("R") & personPlay.equalsIgnoreCase("P")) {
            System.out.println("You WON!!!");

        } else if (personPlay.equalsIgnoreCase("S") & computerPlay.equalsIgnoreCase("P")) {
            System.out.println("You WON!!!");

        } else if (computerPlay.equalsIgnoreCase("S") & personPlay.equalsIgnoreCase("P")) {
            System.out.println("You lose...");

        } else if (personPlay.equalsIgnoreCase("R") & computerPlay.equalsIgnoreCase("S")) {
            System.out.println("You Won!!!");

        } else if (computerPlay.equalsIgnoreCase("R") & personPlay.equalsIgnoreCase("S")) {
            System.out.println("You lose...");

        } else {
            System.out.println("Not a valid choice");

        }

    }

}
