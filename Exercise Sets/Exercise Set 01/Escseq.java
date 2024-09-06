import java.util.Scanner;

public class Escseq{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int start = 0;
        System.out.print("How many lines? \t");
        int choice = scan.nextInt();
        
        for (int x = 0; x < choice; x++){
            start += 7;
            if (x % 2 == 0){
                System.out.println(start);
            }else{
                System.out.println("\t" + start);
            }
        } 
    }
    
}