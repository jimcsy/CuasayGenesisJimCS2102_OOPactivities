import java.util.Scanner;

public class GettingInputs {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the year: ");
        int Year = scan.nextInt();
        
        scan.nextLine();
        
        System.out.print("Enter the genre: ");
        String Genre = scan.nextLine();

        System.out.print("Enter the album: ");
        String Album = scan.nextLine();

        System.out.print("Enter the song title: ");
        String Title = scan.nextLine();

        System.out.print("Enter the artist: ");
        String Artist = scan.nextLine();

        System.out.println("----------------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("----------------------------------------");
        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: \"" + Title + "\"");
        System.out.println("Artist: " + Artist);
    }
}
