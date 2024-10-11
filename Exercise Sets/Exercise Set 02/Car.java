public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size){
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }
    
    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    public char getSize(){

        return size;
    }

    public void setColor(String color){
        this.color = getColor();
    }

    public void setPrice(double price){
        this.price = getPrice();
    }

    public void setSize(char size){
        this.size = getSize();
    }

    public String toString() {
        String sizeString;
        switch (size) {
            case 'S':
                sizeString = "small";
                break;
            case 'M':
                sizeString = "medium";
                break;
            case 'L':
                sizeString = "large";
                break;
            default:
                sizeString = "unknown"; 
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeString);
    }

    public static void main (String[] args){
        Car myCar = new Car("red", 19999, 's');
        System.out.println(myCar);
    }
}

