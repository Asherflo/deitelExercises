package SimpleGeometricObject;

public class MainGeometricObject {
    public static void main(String[] args) {
        Circle circle = new Circle("White",false,6);
         Rectangle rectangle = new Rectangle("white",false,8,9);


        System.out.println("A circle "+ circle.toString());
        System.out.println("the color is "+ circle.getColor());
        System.out.println("the radius is "+ circle.getRadius());
        System.out.println("The area is "+ circle.getArea());
        System.out.println("the diameter is " + circle.getDiameter());


        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("the area is " + rectangle.getArea());
        System.out.println("the perimeter is" + rectangle.getPerimeter());




    }
}
