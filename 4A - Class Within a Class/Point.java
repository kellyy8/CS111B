//Kelly Yu

public class Point {
    //coordinates of the center
    private double x;
    private double y;

    //CONSTRUCTOR --- user decides the center of circle
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //CONSTRUCTOR ---- takes a Point object
    //Point object is defined by a double, x, and double, y
    //Pointer object provides values for its x and y
    public Point(Point p) {
        this(p.x, p.y);
    }

    //call this function to use x as an argument //retrieve x-value to use
    public double getX() {
        return x;
    }

    //call function to set x-coord individually
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //returns distance btwn argument other AND x & y at invocation //dist btwn 2 points
    //idea... invocate w/ center of one circle & set other as the point of a 2nd circle
    public double distanceTo(Point other) {
        // replace this line with your logic

        double xDiffSqrd = Math.pow(other.getX() - x, 2.0);
        double yDiffSqrd = Math.pow(other.getY() - y, 2.0);
        double distBtwnPoints = Math.sqrt(xDiffSqrd + yDiffSqrd);
    
        return distBtwnPoints;
    }

    public boolean equals(Point p) {
        return this.distanceTo(p) < 0.00001;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
