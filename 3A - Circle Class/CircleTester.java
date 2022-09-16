//Kelly Yu

public class CircleTester {

    public static void main(String[] args){

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();

        circle1.setRadius(3.0);
        circle1.setX(0.0);
        circle1.setY(0.0);

        circle2.setRadius(1.0);
        circle2.setX(6.0);
        circle2.setY(6.0);

        circle3.setRadius(2.0);
        circle3.setX(4.0);
        circle3.setY(0.0);

        circle4.setX(4.0);
        circle4.setY(4.0);
        circle4.setRadius(4.0);

        //test cases
        if(circle1.doesOverlap(circle1,circle2) != false)
            System.out.println("\tFAILED doesOverLap for circle1 and circle2");
        
        if(circle1.doesOverlap(circle1,circle3) != true)
            System.out.println("\tFAILED doesOverLap for circle1 and circle3");

        if(circle4.getX() != 4.0)
            System.out.println("\tFAILED getX() for circle4");

        if(circle4.getY() != 4.0)
            System.out.println("\tFAILED getY() for circle4");
    
        if(circle4.getRadius() != 4.0)
            System.out.println("\tFAILED getRadius() for circle4");

        if(((circle1.getArea() - 28.2743) < 0.0001) != true)
            System.out.println("\tFAILED getArea() for circle1");
    

        //circle1 and circle2 do NOT overlap
        if(circle1.doesOverlap(circle1,circle2) == false)
            System.out.println("circle1 and circle2 do not overlap.");

        //circle1 and circle3 overlap
        if(circle1.doesOverlap(circle1,circle3) == true)
            System.out.println("circle1 and circle3 overlap.");

        //circle2 and circle3 do NOT overlap
        if(circle1.doesOverlap(circle2,circle3) == false)
            System.out.println("circle2 and circle3 do not overlap.");

        System.out.println("");

        //display areas of circle1, circle2, circle3
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Area of circle3: " + circle3.getArea());

    }
    
}
