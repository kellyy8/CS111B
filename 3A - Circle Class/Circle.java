//Kelly Yu

public class Circle {
    
    private double radius;
    private double x;
    private double y;

    public void setX(double xValue){
        x = xValue;
    }

    public double getX(){
        return x;
    }

    public void setY(double yValue){
        y = yValue;
    }

    public double getY(){
        return y;
    }

    public void setRadius(double rValue){
        radius = rValue;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double area = radius * radius * Math.PI;
        return area;
    }

    public boolean doesOverlap(Circle c1, Circle c2){
        double sumOfRadii = c1.getRadius() + c2.getRadius();
        double xDiffSqrd = Math.pow(c2.getX()-c1.getX(), 2.0);
        double yDiffSqrd = Math.pow(c2.getY()-c1.getY(), 2.0);

        double distBtwnCenters = Math.sqrt(xDiffSqrd + yDiffSqrd);
        
        if(sumOfRadii >= distBtwnCenters){
            return true;
        }

        return false;
    }
}
