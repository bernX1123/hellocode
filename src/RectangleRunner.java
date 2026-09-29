

public class RectangleRunner {

    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class
        Rectangle rect1 = new Rectangle(5, 6, 6,2);
        rect1.printArea();  // calling a method on the object

        // creating ANOTHER instance/object from the Rectangle class
        Rectangle rect2 = new Rectangle(10, 8, 7,2);
        rect2.printArea();  // calling a method on the object

        Rectangle rect3 = new Rectangle(5,20, 6, 9);
        rect3.printArea();

        rect3.printPerimeter();
        rect2.printPerimeter();
        rect1.printPerimeter();
    }
}



