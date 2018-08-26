package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int guess = 50;
System.out.println("Enter your secret number");
        int yourNumber = 0;
        Scanner keyboard = new Scanner(System.in);
        yourNumber = keyboard.nextInt();
        //user inputs their number

        String lower = "lower";
        String higher = "higher";


        while (true) {


            System.out.println("My guess is " + guess + ". Is my guess higher or lower than your number?");

            String highOrLow = "";

            highOrLow = keyboard.next();
            //user inputs if guess is higher/lower


            if (highOrLow.equals(lower)) {

                int previousGuess = guess;
                System.out.println("Ok, I will guess a lower number.");


                    guess = (int) (Math.random() * 100 + 1);

                    if (guess >= previousGuess){
                        while(guess >= previousGuess){
                            guess = (int) (Math.random() * 100 + 1);
                        }
                    }

                if (guess == yourNumber){
                    System.out.println("I guessed your number!");
                    System.exit(0);
                }


            } else if (highOrLow.equals(higher)) {

                int previousGuess = guess;
                System.out.println("Ok, I will guess a higher number.");


                guess = (int) (Math.random() * 100 + 1);

                if (guess <= previousGuess){
                    while(guess <= previousGuess){
                        guess = (int) (Math.random() * 100 + 1);
                    }
                }

                if (guess == yourNumber){
                    System.out.println("I guessed your number!");
                    System.exit(0);
                }


            } else {
                System.out.println("Sorry, I do not know what you mean.");
            }

        }
    }}