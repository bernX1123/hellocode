// Rectangle class definition
public class Rectangle {

    // instance variables, the object data stored with each object:
    private int length;
    private int width;

    private double xCoord;
    private double yCoord;

    // the constructor used to create Rectangle objects:
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid, double xcord, double ycord) {
        length = len;
        width = wid;
        xCoord = xcord;
        yCoord = ycord;
    }

    // a method (object behavior) that calculates and prints area:
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }

    public void printPerimeter(){
        int perimeter = (length*2) + (width*2);
        System.out.println("My perimeter is " + perimeter);
    }
}
