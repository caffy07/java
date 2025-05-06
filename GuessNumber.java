/*
 * Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */

import java.util.Random;
import java.util.Scanner;

 class Game{
    private int RandomNumber;
    private int noOfGuesses;

    public Game(){
        Random random = new Random();
        this.RandomNumber = random.nextInt(100) + 1;
        this.noOfGuesses = 0;
    }
    public void play(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter your guess between 1 to 100: ");
            int userGuess = sc.nextInt();
            this.noOfGuesses++;

            if(userGuess == RandomNumber){
                System.out.println("Congratulations you have guessed the correct number.");
                System.out.println("Number of guesses = " + noOfGuesses);
            }
            else if(userGuess < RandomNumber){
                System.out.println("Try guessing higher number");
            }
            else{
                System.out.println("Try guessing lower number");
            }

        }
    }
}
public class GuessNumber {
     public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Welcome to the Guess the Number game!");
        game.play();
    }
}
