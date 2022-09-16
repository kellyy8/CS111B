//Kelly Yu

public class NumberGuesser2 {
    protected int lowest;                   //changed to protected
    protected int highest;                  //changed to protected

    //ADDED
    protected boolean changeRange;                //checks if higher()/lower() is invoked
    protected int theGuess;                      //holds onto the guess value until it should be changed

    //store original boundary values passed into the constructor
    private int origLow;   
    private int origHigh;   

    public NumberGuesser2(int lowerBound, int upperBound){
        lowest = lowerBound;
        highest = upperBound;
        origLow = lowest;
        origHigh = highest;
        theGuess = 0;
    }

    //correct number is higher, adjust the lower bound to be guess+1
    public void higher(){
        changeRange = true;
        lowest = theGuess + 1;
    }

    //correct number is lower, adjust the upper bound to be guess-1
    public void lower(){
        changeRange = true;
        highest = theGuess - 1;
    }

    //theGuess = the midPoint
    //returns the midPoint value when method is called
    public int getCurrentGuess(){
        theGuess = (lowest + highest)/2;
        return theGuess;
    }

    public void reset(){
        lowest = origLow;
        highest = origHigh;
    }

}
