/**
 * Main class to demonstrate the functionality of the MusicLibrary.
 * This class contains the main method to create and interact with different types of media in the music library.
 * It creates instances of Record, CompactDisc, and AudioFile, adds them to the MusicLibrary, and tests their playback functionality.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris H.
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        // Declare variables to hold instances of different media types
        final Record record; // Represents a vinyl record
        final CompactDisc compactDisc; // Represents a compact disc (CD)
        final AudioFile audioFile; // Represents an audio file

        // Create instances of Record, CompactDisc, and AudioFile
        record = new Record("The Beatles", "Hey Jude", 1, 7, 1968, 7.0, 45.0);
        compactDisc = new CompactDisc("Neil Young & Crazy Horse", "Everybody Knows This Is Nowhere", 4, 40, 1969, false, false);
        audioFile = new AudioFile("Donnie Iris and the Cruisers", "Ah Leah!", 1, 4, 1980, "wav");

        // Create an instance of MusicLibrary
        final MusicLibrary library;
        library = new MusicLibrary();

        // Add instances of media to the library
        library.addMedia(record);
        library.addMedia(compactDisc);
        library.addMedia(audioFile);

        // Display the contents of the library
        System.out.println("----------");
        library.displayLibrary();

        // Test the playback functionality of the library
        System.out.println("----------");
        library.playTitle("Hey Jude");
        System.out.println("----------");
        library.playTitle("Everybody Knows This Is Nowhere");
        System.out.println("----------");
        library.playTitle("Ah Leah!");
        System.out.println("----------");
        library.playTitle("Stairway to Heaven");
    }
}
