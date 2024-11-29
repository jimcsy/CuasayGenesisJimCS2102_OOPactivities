import java.lang.Math;
public class Triangle implements Shape{
    private double a, b, c;

    Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c) );
    }

    public double getPerimeter(){
        return (a + b + c);
    }
}
