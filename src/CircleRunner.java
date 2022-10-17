public class CircleRunner {
    public static void main(String[] args) {
        Circle testCircle = new Circle(5.0);
        System.out.println(testCircle.getInfo());
        testCircle.setRadius(9.2);
        System.out.println(testCircle.getInfo());

        System.out.println();

        Circle circle2 = new Circle(7.0);
        System.out.println(circle2.getInfo());
        circle2.setRadius(17.0);
        System.out.println(circle2.getInfo());
    }
}
