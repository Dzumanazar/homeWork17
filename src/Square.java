public class Square extends Shape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

}
