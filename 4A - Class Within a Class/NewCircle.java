//Kelly Yu

public class NewCircle{

    private Point center = new Point(0.0, 0.0);
    private double radius;
    

    //two argument constructor                      //since center is a Point, we have to enter the Point to get to the private member x value
    public NewCircle(Point o, double r){              //takes x value of o --> passes it to setX() which will set the x value of OUR center to x value of o
        center.setX(o.getX());                    //copies over the double object itself
        center.setY(o.getY());                    //doesn't copy reference to o's x-variable (center.x = o.x)
        radius = r;

    }

    //three argument constructor
    public NewCircle(double xValue, double yValue, double r){
        Point aPoint = new Point(xValue, yValue);
        
        center.setX(aPoint.getX());
        center.setY(aPoint.getY());    
        radius = r;
    }

    //no argument constructor
    public NewCircle(){
        Point aPoint = new Point(0.0,0.0);
        center.setX(aPoint.getX());
        center.setY(aPoint.getY());
        radius = 1.0;
    }

    //copy constructor
    public NewCircle(NewCircle c1){
        center.setX(c1.getX());                     //set OUR x to the value of x we get from another circle
        center.setY(c1.getY());
        radius = c1.getRadius();
    }

//-----------------------------------------------------------------------------

    public void setCenter(Point p){
        center.setX(p.getX());
        center.setY(p.getY());
    }

    public Point getCenter(){
        return center;
    }

    //gets x-coord from argument; assigns it as OUR circle's center's x-coord
    public void setX(double xValue){
        center.setX(xValue);                            //access 'center' point's setX() function to set 'center' point's
    }

    //returns OUR point center's x-coord
    public double getX(){
        return center.getX();                           //access 'center' point's getX() function to get 'center' point's x-Val
    }

    public void setY(double yValue){
        center.setY(yValue);
    }

    public double getY(){
        return center.getY(); 
    }

    public void setRadius(double rValue){
        radius = rValue;
    }

    public double getRadius(){
        return radius;
    }

//-----------------------------------------------------------------------------------
    public double getArea(){
        double area = radius * radius * Math.PI;
        return area;
    }

    public boolean doesOverlap(NewCircle c1){
        // double xDiffSqrd = Math.pow(c2.getX()-c1.getX(), 2.0);
        // double yDiffSqrd = Math.pow(c2.getY()-c1.getY(), 2.0);
        // double distBtwnCenters = Math.sqrt(xDiffSqrd + yDiffSqrd);
        
        double sumOfRadii = radius + c1.getRadius();
        double distBtwnCenters = center.distanceTo(c1.getCenter());                 //evaluate distance btwn c1's center to c2's center

        if(sumOfRadii >= distBtwnCenters){
            return true;
        }

        return false;
    }

    public String toString(){
        // String circleInfo = "Circle x: ";
        // circleInfo = circleInfo.concat(toString(center.getX()));
        // circleInfo = circleInfo.concat(", y: ").concat(center.getY());
        // circleInfo = circleInfo.concat(", radius: ").concat(radius);
        
        // return circleInfo;
        
        return "Circle x: " + center.getX() + ", y: " + center.getY() + ", radius: " + radius;
    }

    public boolean equals(NewCircle c){
        if(center.equals(c.getCenter()) && c.getRadius() == radius)
            return true;

        return false;
    }


}