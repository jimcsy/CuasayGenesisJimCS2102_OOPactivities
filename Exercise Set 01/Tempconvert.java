import java.util.Scanner;

public class Tempconvert{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Celsius value: ");
        float value = scan.nextInt();
        
        float solution = (value * 9 / 5) + 32;
        System.out.println(String.format("%.2f", value) + " Celsius is " + String.format("%.2f", solution) + " Fahrenheit");
    }
    
}