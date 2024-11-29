public class ShapeCollection {
    private Shape [] shapes;

    ShapeCollection(Shape [] shapes){
        this.shapes = shapes;
    }

    public void getPropertyValues(){
        for (Shape shape : shapes){
            System.out.println(shape.getClass().getSimpleName());
            System.out.println(String.format("Area: %.2f", shape.getArea()));
            System.out.println(String.format("Perimeter: %.2f", shape.getPerimeter()) + "\n");
        }
    }
    
}
