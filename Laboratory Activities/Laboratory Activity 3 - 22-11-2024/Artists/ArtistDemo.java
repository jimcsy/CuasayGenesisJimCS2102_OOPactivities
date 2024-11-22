public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        Artist singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        Artist painter = new Painter("Alexandra Reyes", "Filipino", 25, "Painting", Medium.OIL);
        Artist writer = new Writer("Eliza Santos", "Filipino", 28, "Writing", WritingStyle.FICTION);
        Artist dancer = new Dancer("Marco Delacruz", "Filipino", 22, "Singing", DanceStyle.HIPHOP);

        artist.displayInfo();
        singer.displayInfo();
        painter.displayInfo();
        writer.displayInfo();
        dancer.displayInfo();
    }
}