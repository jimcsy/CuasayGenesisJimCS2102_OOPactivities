import java.util.Scanner;

public class GettingGreater {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        char firstChar = scan.next().charAt(0);

        System.out.print("Enter second character: ");
        char secondChar = scan.next().charAt(0);
        
        System.out.println("----------------------------------------");
        System.out.println ( "The character with greater value is: " + (char) Math.max(firstChar, secondChar));
        System.out.println("----------------------------------------");

        System.out.println("Showing the ASCII codes");
        System.out.println(firstChar + ": "+ (int) firstChar);
        System.out.println(secondChar + ": "+ (int) secondChar);

        scan.close();
    }
}
