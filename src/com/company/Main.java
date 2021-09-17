package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random randomNumber = new Random();
        int generatedRandomNumber = randomNumber.nextInt(100);
        //generates random number

        Scanner input = new Scanner(System.in);
        int loopNumber = 0;
        int score = 1;
        System.out.println(generatedRandomNumber);
        while (loopNumber == 0) {
            System.out.println("Enter Guess");
            int userGuess = input.nextInt();
            if (userGuess == generatedRandomNumber) {
                System.out.println("Good Job, you score was: " + score);
                loopNumber = 1;
            }
            if (userGuess < generatedRandomNumber && (generatedRandomNumber - userGuess) <= 5) {
                System.out.println("Hot, try again");
                score ++;
            }
            if (userGuess > generatedRandomNumber && (userGuess - generatedRandomNumber) <= 5) {
                System.out.println("Hot, try again");
                score ++;
            }



        }
    }
}
