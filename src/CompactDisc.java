/**
 * Represents a compact disc (CD), extending the MusicMedia class.
 * This class provides functionalities to create and manipulate CDs.
 * Extends the MusicMedia class to inherit common attributes and methods.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris H.
 * @version 2024
 */
public class CompactDisc extends MusicMedia
{
    // Declaring private instance variables
    private final boolean hasBonusTracks; // Indicates whether the CD has bonus tracks
    private final boolean hasDigipac; // Indicates whether the CD has a digipac packaging

    /**
     * Constructs a CompactDisc object with the specified attributes.
     *
     * @param songArtist         The artist of the songs in the CD.
     * @param songTitle          The title of the CD.
     * @param totalNumberOfSongs The total number of songs in the CD.
     * @param totalRuntimeMins   The total runtime of the CD in minutes.
     * @param yearReleased       The year the CD was released.
     * @param hasBonusTracks     Indicates whether the CD has bonus tracks.
     * @param hasDigipac         Indicates whether the CD has a digipac packaging.
     */
    public CompactDisc(final String songArtist,
                       final String songTitle,
                       final int totalNumberOfSongs,
                       final int totalRuntimeMins,
                       final int yearReleased,
                       final boolean hasBonusTracks,
                       final boolean hasDigipac)
    {
        // Call the constructor of the parent class (MusicMedia) to initialize common attributes
        super(songArtist, songTitle, totalNumberOfSongs, totalRuntimeMins, yearReleased);
        this.hasBonusTracks = hasBonusTracks; // Set the hasBonusTracks attribute
        this.hasDigipac = hasDigipac; // Set the hasDigipac attribute
    }

    /**
     * Generates a String representation of the CompactDisc object.
     *
     * @return A String representation of the CompactDisc object.
     */
    @Override
    public String toString()
    {
        // Format and return a string representation of the CompactDisc object
        return String.format("CompactDisc [bonusTracks=%b, digipac=%b, %s]", hasBonusTracks, hasDigipac, super.toString());
    }

    /**
     * Plays a section of the CD and overrides the playSection method from the MusicMedia class.
     */
    @Override
    public void playSection()
    {
        // Display information about the selected CD
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the CD " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This is a Compact Disc from the year " + getYearReleased() + ".");
    }
}
