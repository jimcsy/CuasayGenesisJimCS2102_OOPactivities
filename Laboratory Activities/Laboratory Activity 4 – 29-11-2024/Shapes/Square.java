import java.lang.Math;

public class Square implements Shape{
    private double side;

    Square(double side){
        this.side =side;
    }
    public double getArea(){
        return Math.pow(side, 2);
    }

    public double getPerimeter(){
        return (side * 4);
    }
}
