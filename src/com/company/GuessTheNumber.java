package com.company;

import java.util.Scanner;

public class GuessTheNumber {
    public static void start(){
        System.out.println("*** GUESS THE NUMBER ***");
        System.out.println("Guess the number between 1 and 20");
        int answer = (int)Math.ceil(Math.random()*20); // generates a random number between 1 and 20
        //System.out.println("answer: "+answer);
        takeUserInput(answer);
    }

    private static void takeUserInput(int answer){
        boolean guessed = false;
        Scanner scanner = new Scanner(System.in);
        while(!guessed){
            System.out.print("Your Guess: ");
            int guess = scanner.nextInt();
            guessed = checkAnswer(answer, guess);
        }
    }

    private static boolean checkAnswer(int answer, int guess){
        boolean guessed = false;
        if(guess == answer) {
            System.out.println("You guessed correctly. Congratulations!!! You just won $1M :-D");
            guessed = true;
        }
        else{
            int difference = Math.abs(answer - guess); // absolute value of the difference
            if(difference <= 7){
                if(guess < answer)
                    System.out.println("Your guess was close to the answer. Try a bit larger");
                else
                    System.out.println("Your guess was close to the answer. Try a bit smaller");
            } else{
                if(guess < answer)
                    System.out.println("Your guess is too low from the answer");
                else
                    System.out.println("Your guess is too high from the answer");
            }
        }
        return guessed;
    }
}
