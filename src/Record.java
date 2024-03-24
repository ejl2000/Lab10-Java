/**
 * Represents a physical record, extending the MusicMedia class.
 * This class encapsulates details about a record, such as artist, title, number of songs, runtime, release year,
 * size, and revolutions per minute (rpm).
 * It provides methods to validate the input data and retrieve information about the record.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris H.
 * @version 1.0
 */
public class Record extends MusicMedia
{
    private final double recordSizeInches; // Size of the record in inches
    private final double rpm; // Revolutions per minute (rpm) of the record

    private static final int DISC_SIZE_7_INCHES = 7; // Standard size of a 7-inch record
    private static final int DISC_SIZE_10_INCHES = 10; // Standard size of a 10-inch record
    private static final int DISC_SIZE_12_INCHES = 12; // Standard size of a 12-inch record
    private static final double RPM_1 = 33.3; // Standard rpm for 33.3 rpm records
    private static final double RPM_2 = 45.0; // Standard rpm for 45 rpm records
    private static final double RPM_3 = 78.0; // Standard rpm for 78 rpm records

    /**
     * Constructs a Record object with the specified attributes.
     *
     * @param songArtist         The artist of the song.
     * @param songTitle          The title of the song.
     * @param totalNumberOfSongs The total number of songs on the record.
     * @param totalRuntimeMins   The total runtime of the record in minutes.
     * @param yearReleased       The year the record was released.
     * @param recordSizeInches   The size of the record in inches.
     * @param rpm                The revolutions per minute (rpm) of the record.
     */
    public Record(final String songArtist, final String songTitle, final int totalNumberOfSongs,
                  final int totalRuntimeMins, final int yearReleased, final double recordSizeInches,
                  final double rpm)
    {
        super(songArtist, songTitle, totalNumberOfSongs, totalRuntimeMins, yearReleased);

        this.recordSizeInches = recordSizeInches;
        this.rpm = rpm;

        validateRecord(); // Validate the record's attributes
    }

    /**
     * Validates the record size and rpm values and throws an IllegalArgumentException if they are invalid.
     */
    private void validateRecord()
    {
        if (recordSizeInches != DISC_SIZE_7_INCHES && recordSizeInches != DISC_SIZE_10_INCHES &&
                recordSizeInches != DISC_SIZE_12_INCHES)
        {
            throw new IllegalArgumentException("Invalid record size entered " + recordSizeInches);
        }
        if (rpm != RPM_1 && rpm != RPM_2 && rpm != RPM_3)
        {
            throw new IllegalArgumentException("Invalid rpm entered: " + rpm);
        }
    }

    /**
     * Retrieves the size of the record in inches.
     *
     * @return the size of the record in inches
     */
    public double getRecordSizeInches()
    {
        return recordSizeInches;
    }

    /**
     * Retrieves the revolutions per minute (rpm) of the record.
     *
     * @return the revolutions per minute (rpm) of the record
     */
    public double getRpm()
    {
        return rpm;
    }

    /**
     * Generates a String representation of the Record object.
     *
     * @return a String representation of the Record object
     */
    @Override
    public String toString()
    {
        return String.format("Record [size=%.0f, rpm=%.1f, %s]", recordSizeInches, rpm, super.toString());
    }

    /**
     * Plays a section of the record and overrides the playSection method from the MusicMedia class.
     */
    @Override
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the record " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This is a " + (int) recordSizeInches + " inch record from " + getYearReleased() +
                ", playing at " + rpm + " rpm.");
    }
}
