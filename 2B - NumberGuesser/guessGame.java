//Kelly Yu

import java.util.Scanner;

public class guessGame {

    public static boolean shouldPlayAgain(){
        System.out.print("Great! Do you want to play again? (y/n): ");
        Scanner scnr = new Scanner(System.in);
        char playAgain = scnr.next().charAt(0);

        if(playAgain == 'y')
            return true;
        
        return false;
    }

    public static char getUserResponseToGuess(int guess){
        System.out.print("Is it " + guess + "? (h/l/c): ");
        Scanner scnr = new Scanner(System.in);
        char userAnswer = scnr.next().charAt(0);

        return userAnswer;
    }

    public static int getMidpoint(int low, int high){
        int midPoint = (high+low)/2;
        return midPoint;
    }

    public static void playOneGame(){
        int min = 1;
        int max = 100;
        int ourGuess = getMidpoint(min, max);
        char userSays = getUserResponseToGuess(ourGuess);
        
        while (userSays =='h' || userSays == 'l'){
            if(userSays == 'h'){
                min = ourGuess+1;
                ourGuess = getMidpoint(min, max);
                userSays = getUserResponseToGuess(ourGuess);
            }
  
            else if (userSays == 'l'){
                max = ourGuess-1;
                ourGuess = getMidpoint(min, max);
                userSays = getUserResponseToGuess(ourGuess);
            }
        }
      }
    public static void main(String[] args){
        System.out.print("Guess a number from 1 to 100.\n"); 

        do {

            playOneGame();
            
            } while (shouldPlayAgain());
    }

}
