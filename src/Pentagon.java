public class Pentagon extends Shape {

    private int a;
    private int b;
    private int c;
    private int d;
    private int i;

    public Pentagon(int a, int b, int c, int d, int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = i;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d + i;
    }
}
