//Kelly Yu

import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser2{

    Random randGen = new Random();              //random number generator

    //constructor
    public RandomNumberGuesser(int lower, int upper){
        // super.NumberGuesser2(lower, upper);
        super(lower, upper);
        changeRange = true;            //start as true to generate the first random guess
    }

    @Override
    public int getCurrentGuess(){
        int rangeOfVals = highest - lowest + 1;

        //if higher/lower is called & there's at least 1 number to generate 
        if(changeRange == true && rangeOfVals >=1){                 
            theGuess = randGen.nextInt(rangeOfVals) + lowest;        //update with a new random number
            changeRange = false;                                      //reset boolean
        }

        return theGuess;                                         //return the guess
    }

}




    // @Override
    // public void higher(){
    //     //prevents us from guessing beyond 100 (highest possible guess)
    //     if(lowest != origHigh){
    //         changeRange = true;
    //         lowest = theGuess + 1;
    //     }

        // System.out.print("low: " + lowest + " high: ");
        // System.out.println(highest);
    // }

//     @Override
//     public void lower(){
//         //prevents us from guessing below 1 (lowest possible guess)
//         if(highest != origLow){
//             changeRange = true;
//             highest = theGuess - 1;
//         }
//     }
// }