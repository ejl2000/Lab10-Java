/**
 * Represents an audio file, extending the MusicMedia class.
 * This class provides functionalities to create and manipulate audio files.
 * Extends the MusicMedia class to inherit common attributes and methods.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris H.
 * @version 2024
 */
public class AudioFile extends MusicMedia
{
    // Declare private instance variables
    private final String fileType; // Type of the audio file (e.g., mp3, m4a, wav)

    // Declare constant variables for supported file extensions
    private static final String FILE_EXT_MP3 = "mp3";
    private static final String FILE_EXT_M4A = "m4a";
    private static final String FILE_EXT_WAV = "wav";

    /**
     * Constructs an AudioFile object with the specified attributes.
     *
     * @param songArtist          The artist of the song.
     * @param songTitle           The title of the song.
     * @param totalNumberOfSongs  The total number of songs in the audio file.
     * @param totalRuntimeMins    The total runtime of the audio file in minutes.
     * @param yearReleased        The year the audio file was released.
     * @param fileType            The type of the audio file.
     */
    public AudioFile(final String songArtist,
                     final String songTitle,
                     final int totalNumberOfSongs,
                     final int totalRuntimeMins,
                     final int yearReleased,
                     final String fileType)
    {
        // Call the constructor of the parent class (MusicMedia) to initialize common attributes
        super(songArtist, songTitle, totalNumberOfSongs, totalRuntimeMins, yearReleased);
        this.fileType = fileType; // Set the fileType attribute
        validateFileType(); // Validate the fileType
    }

    /**
     * Validates the file type and throws an exception if an invalid file type is entered.
     *
     * @throws IllegalArgumentException if an invalid file type is entered
     */
    private void validateFileType()
    {
        // Check if the fileType is not equal to any of the supported file extensions
        if (!fileType.equalsIgnoreCase(FILE_EXT_MP3)
                && !fileType.equalsIgnoreCase(FILE_EXT_M4A)
                && !fileType.equalsIgnoreCase(FILE_EXT_WAV))
        {
            throw new IllegalArgumentException("Invalid file type entered"); // Throw exception for invalid file type
        }
    }

    /**
     * Generates a string representation of the AudioFile object.
     *
     * @return A string representation of the AudioFile object.
     */
    @Override
    public String toString()
    {
        // Format and return a string representation of the AudioFile object
        return String.format("AudioFile [fileType=%s, %s]", fileType, super.toString());
    }

    /**
     * Plays a section of the audio file and overrides the playSection method from the MusicMedia class.
     */
    @Override
    public void playSection()
    {
        // Display information about the selected audio file
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYearReleased() + ".");
    }
}
