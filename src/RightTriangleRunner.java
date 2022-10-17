public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(3, 4);
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);

        double tri1Hyp = tri1.hypotenuse();
        double tri2Hyp = tri2.hypotenuse();

        System.out.println(tri1Hyp);
        System.out.println(tri2Hyp);

        RightTriangle tri3 = new RightTriangle(7, 17);
        System.out.println(tri3.hypotenuse());

    }
}
