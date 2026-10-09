public class MathRunner {
    public static void main(String[] args){
        RightTriangle tr1 = new RightTriangle(6.5, 10.7);
        RightTriangle tr2 = new RightTriangle(3, 4);

        System.out.println(tr1.hypotenuse());
        System.out.println(tr2.hypotenuse());

    }
}
