//Kelly Yu

import java.util.*;

public class Blackjack {
    public static void main(String[] args){
        Random random = new Random();
        int card1;
        int card2;
        int total;
        char wantCard = 'n';
        char goAgain = 'y';

        while(goAgain == 'y'){
            card1 = random.nextInt(10)+1;
            card2 = random.nextInt(10)+1;
            total = card1 + card2;

            System.out.println("First cards: " + card1 + ", " + card2);
            System.out.println("Total: " + total);
            System.out.print("Do you want another card? (y/n): ");
            Scanner scnr = new Scanner(System.in);
            wantCard = scnr.next().charAt(0);

            int newCard;

            while(wantCard == 'y'){
                newCard = random.nextInt(10)+1;
                total += newCard;

                System.out.println("Card: " + newCard);
                System.out.println("Total: " + total);

                if(total > 21){
                    System.out.println("Bust.");
                    break;
                }

                System.out.print("Do you want another card? (y/n): ");
                wantCard = scnr.next().charAt(0);
            }

            System.out.print("Would you like to play again? (y/n): ");
            goAgain = scnr.next().charAt(0);
            System.out.println();
        }
    }    
}
