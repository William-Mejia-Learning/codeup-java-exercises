package shapes;

public class ShapesTest {
    public static void main(String[] args) {

      Measurable mySpace = new Rectangle(4, 5);
        System.out.println(mySpace.getPerimeter());
        System.out.println(mySpace.getArea());

        Measurable mySpace1 = new Square(5);
        System.out.println(mySpace1.getPerimeter());
        System.out.println(mySpace1.getArea());

    }
}
