public class RightTriangle {

    private double base;
    private double height;

    public RightTriangle(double b, double h){
        base = b;
        height = h;
    }

    public double hypotenuse(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
    }
}