public class Circle {

    private double radius;

    public Circle(double radii){
        radius = radii;
    }

    public void circleArea(){
        double area = radius*radius*Math.PI;
        System.out.println("The area of the circle (radius " + radius + " ) is: " + area);
    }
}
