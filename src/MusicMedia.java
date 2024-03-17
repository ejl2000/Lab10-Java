import java.util.ArrayList;

/**
 * MusicMedia represents the class for music media.
 *
 * @author Emma, Samson
 * @version 2024
 */
class MusicMedia
{
    private final String artist;
    private final String title;
    private final int trackCount;
    private final int totalMinutes;
    private final int year;

    /**
     * Constructs a MusicMedia object.
     *
     * @param artist      The artist of the music.
     * @param title       The title of the music.
     * @param trackCount  The number of tracks in the music.
     * @param totalMinutes The total duration of the music in minutes.
     * @param year        The year the music was released.
     * @throws IllegalArgumentException if any argument is invalid.
     */
    public MusicMedia(final String artist, final String title, final int trackCount, final int totalMinutes, int year)
    {
        if (artist == null || title == null || trackCount <= 0 || totalMinutes <= 0 || year <= 0)
        {
            throw new IllegalArgumentException("Invalid arguments for MusicMedia constructor");
        }

        this.artist = artist;
        this.title = title;
        this.trackCount = trackCount;
        this.totalMinutes = totalMinutes;
        this.year = year;
    }


    public String getArtist()
    {
        return artist;
    }

    public String getTitle()
    {
        return title;
    }

    public int getTrackCount()
    {
        return trackCount;
    }

    public int getTotalMinutes()
    {
        return totalMinutes;
    }

    public int getYear()
    {
        return year;
    }

    /**
     * Displays a message when the music is played.
     */
    public void playSelection()
    {
        System.out.println("Thank you for using our Music Library.");
    }

    @Override
    public String toString()
    {
        return "toString()=Album [Artist=" + artist + ", title=" + title + ", trackCount=" + trackCount + ", totalMinutes=" + totalMinutes + "]";
    }
}

