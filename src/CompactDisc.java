/**
 * Represents a compact disc in the music library.
 *
 * @author Emma, Samson
 * @version 2024
 */
class CompactDisc extends MusicMedia
{
    private boolean bonusTracks;
    private boolean digipac;

    /**
     * Constructs a CompactDisc object.
     *
     * @param artist      The artist of the compact disc.
     * @param title       The title of the compact disc.
     * @param trackCount  The number of tracks in the compact disc.
     * @param totalMinutes The total duration of the compact disc in minutes.
     * @param year        The year the compact disc was released.
     * @param bonusTracks Indicates if the compact disc has bonus tracks.
     * @param digipac     Indicates if the compact disc comes in digipac format.
     */
    public CompactDisc(final String artist, final String title, final int trackCount, final int totalMinutes, final int year, final boolean bonusTracks, final boolean digipac)
    {
        super(artist, title, trackCount, totalMinutes, year);

        this.bonusTracks = bonusTracks;
        this.digipac = digipac;
    }

    @Override
    public void playSelection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the CD " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This is a Compact Disc from the year " + getYear() + ".");
    }

    @Override
    public String toString()
    {
        return "CompactDisc [bonusTracks=" + bonusTracks + ", digipac=" + digipac + ", " + super.toString() + "]";
    }
}