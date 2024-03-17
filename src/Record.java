/**
 * Record represents a record of music media.
 *
 * @author Emma, Samson
 * @version 2024
 */
class Record extends MusicMedia
{
    private final int size; // inches
    private final double rpm; // revolutions per minute

    /**
     * Constructs a Record object.
     *
     * @param artist      The artist of the record.
     * @param title       The title of the record.
     * @param trackCount  The number of tracks in the record.
     * @param totalMinutes The total duration of the record in minutes.
     * @param year        The year the record was released.
     * @param size        The size of the record in inches.
     * @param rpm         The revolutions per minute of the record.
     * @throws IllegalArgumentException if any argument is invalid.
     */
    public Record(final String artist, final String title, final int trackCount, final int totalMinutes, final int year, final int size, final double rpm)
    {
        super(artist, title, trackCount, totalMinutes, year);

        if (size != 7 && size != 10 && size != 12)
        {
            throw new IllegalArgumentException("Invalid size for Record");
        }

        if (rpm != 33.3 && rpm != 45.0 && rpm != 78.0)
        {
            throw new IllegalArgumentException("Invalid rpm for Record");
        }

        this.size = size;
        this.rpm = rpm;
    }

    @Override
    public void playSelection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the record " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This is a " + size + " inch record from " + getYear() + ", playing at " + rpm + " rpm.");
    }

    @Override
    public String toString()
    {
        return "Record [size=" + size + ", rpm=" + rpm + ", " + super.toString() + "]";
    }
}
