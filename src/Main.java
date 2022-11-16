public class Main {
    public static void main(String[] args) {
     Triangle triangle = new Triangle(4, 6,4);
        System.out.println(triangle.getPerimeter());
        Square square =new Square(4);
        System.out.println(square.getPerimeter());
        Pentagon pentagon = new Pentagon(4, 5, 4, 5, 4);
        System.out.println(pentagon.getPerimeter());
        Circle circle = new Circle(5);
        System.out.println(circle.getPerimeter());
        Rectengle rectengle = new Rectengle(4, 5, 4, 5);
        System.out.println(rectengle.getPerimeter());
    }
}