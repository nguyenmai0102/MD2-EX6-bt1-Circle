package CircleClass;

public class Main {
    public static void main(String[] args) {
        // check Circle
        System.out.printf(" *************CIRCLE**************");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(1.0, "red");
        System.out.println(circle);

        // check Cylinder
        System.out.println("---------CILINDER---------------");

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(7);
        System.out.println(cylinder);

        cylinder = new Cylinder(5, "blue", 7);
        System.out.println(cylinder);


    }
}
