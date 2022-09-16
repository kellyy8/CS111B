//Kelly Yu

public class newCircleTester{
    
    public static void main(String[] args){

        //try all 4 constructors
        Point circ1Center = new Point(0.0,0.0);

        NewCircle circ1 = new NewCircle(circ1Center, 3.0);
        NewCircle circ2 = new NewCircle(6.0, 6.0, 1.0);
        NewCircle circ3 = new NewCircle(circ1);                                 //circ1 should be identical to circ3
        NewCircle circ4 = new NewCircle();                                      //circ4 center 0,0 radius 1

        
        //getArea method
        if(((circ1.getArea() - 28.2743) < 0.0001) != true)
            System.out.println("\tFAILED getArea() for circ1");

        //doesOverLap method
        if(circ1.doesOverlap(circ2) != false)
            System.out.println("\tFAILED doesOverLap for circ1 and circ2");
        if(circ1.doesOverlap(circ4) != true)
            System.out.println("\tFAILED doesOverLap for circ1 and circ4");

        //equals method for NewCircle
        if(circ1.equals(circ3) != true )
            System.out.println("\tFAILED equals for circ1 and circ3");
        if(circ2.equals(circ3) != false )
            System.out.println("\tFAILED equals for circ2 and circ3");

        //toString method
        if(circ4.toString().compareTo("Circle x: 0.0, y: 0.0, radius: 1.0") != 0)
            System.out.println("\tFAILED toString for circ4");
        if(circ1.toString().compareTo("Circle x: 0.0, y: 0.0, radius: 3.0") != 0)
            System.out.println("\tFAILED toString for circ1");


    }
}