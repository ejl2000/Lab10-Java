/**
 * This class tests the MusicLibrary and related classes.
 *
 * @author Emma, Samson
 */
public class Main
{
    public static void main(final String[] args)
    {
        final MusicLibrary library;
        library = new MusicLibrary();

        // Creating instances of each subtype and adding them to the library
        final Record record;
        final CompactDisc cd;
        final AudioFile audioFile;

        record = new Record("The Beatles", "Hey Jude", 1, 7, 1968, 7, 45.0);
        cd = new CompactDisc("Neil Young & Crazy Horse", "Everybody Knows This Is Nowhere", 4, 40, 1969, false, false);
        audioFile = new AudioFile("Donnie Iris and the Cruisers", "Ah Leah!", 1, 4, 1980, "wav");

        library.addMedia(record);
        library.addMedia(cd);
        library.addMedia(audioFile);

        // Testing the remaining MusicLibrary methods
        library.displayLibrary();
        library.playTitle("Hey Jude");
        library.playTitle("Everybody Knows This Is Nowhere");
        library.playTitle("Ah Leah!");
    }
}