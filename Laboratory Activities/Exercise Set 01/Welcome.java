import java.util.Scanner;

public class Welcome{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to CS 211: Object-oriented Programming!");
        System.out.print("Enter your name: ");
        
        String name = scan.nextLine();
        
        System.out.println("This course will be fun, " + name + "!");
    }
    
}