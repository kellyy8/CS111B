//Kelly Yu

import java.util.Scanner;

public class GuessingProgram2 {

    public static boolean shouldPlayAgain(){
        System.out.print("Do you want to play again? (y/n): ");
        Scanner scnr = new Scanner(System.in);
        char playAgain = scnr.next().charAt(0);

        if(playAgain == 'y')
            return true;
        
        System.out.println("Good bye.");
        return false;
    }

    public static char getUserResponseToGuess(int guess){
        System.out.print("Is the number " + guess + "? (h/l/c): ");
        Scanner scnr = new Scanner(System.in);
        char userAnswer = scnr.next().charAt(0);

        return userAnswer;
    }

    public static void playOneGame(){
        RandomNumberGuesser guess = new RandomNumberGuesser(1, 100);        //changed

        int ourGuess = guess.getCurrentGuess();
        char userSays = getUserResponseToGuess(ourGuess);
        
        //changed
        while (userSays == 'h' || userSays == 'l' || userSays != 'c'){
            if(userSays == 'h'){
                guess.higher();
                ourGuess = guess.getCurrentGuess();
                userSays = getUserResponseToGuess(ourGuess);
            }
  
            else if (userSays == 'l'){
                guess.lower();
                ourGuess = guess.getCurrentGuess();
                userSays = getUserResponseToGuess(ourGuess);
            }

            //ADDED
            else if (userSays != 'c'){               //if still playing, but higher()/lower() not called
                ourGuess = guess.getCurrentGuess();
                userSays = getUserResponseToGuess(ourGuess);         //ourGuess should remain the same
            }

        }

        System.out.println("You picked " + ourGuess + "? Great pick.");
        guess.reset();

      }

    public static void main(String[] args){
        System.out.print("Think of a number from 1 to 100\n"); 

        do {

            playOneGame();
            
            } while (shouldPlayAgain());

    }

        // public static void main(String[] args){
        //     NumberGuesser2 ng = new NumberGuesser2(1, 10);
        //     System.out.println(ng.getCurrentGuess());
        //     ng.higher();
        //     System.out.println(ng.getCurrentGuess());
        //     System.out.println(ng.getCurrentGuess());

        //     RandomNumberGuesser rng = new RandomNumberGuesser(1, 10);
        //     System.out.println(rng.getCurrentGuess());
        //     rng.higher();
        //     System.out.println(rng.getCurrentGuess());
        //     System.out.println(rng.getCurrentGuess());

        // }

}
