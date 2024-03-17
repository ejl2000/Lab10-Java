/**
 * Represents an audio file in the music library.
 *
 * @author Emma, Samosn
 * @version 2024
 */
class AudioFile extends MusicMedia
{
    private final String fileType;

    /**
     * Constructs an AudioFile object.
     *
     * @param artist      The artist of the audio file.
     * @param title       The title of the audio file.
     * @param trackCount  The number of tracks in the audio file.
     * @param totalMinutes The total duration of the audio file in minutes.
     * @param year        The year the audio file was released.
     * @param fileType    The file type of the audio file.
     * @throws IllegalArgumentException if any argument is invalid.
     */
    public AudioFile(final String artist, final String title, final int trackCount, final int totalMinutes, final int year, final String fileType)
    {
        super(artist, title, trackCount, totalMinutes, year);

        if (!fileType.equals("mp3") && !fileType.equals("m4a") && !fileType.equals("wav"))
        {
            throw new IllegalArgumentException("Invalid fileType for AudioFile");
        }

        this.fileType = fileType;
    }

    @Override
    public void playSelection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYear() + ".");
    }

    @Override
    public String toString()
    {
        return "AudioFile [fileType=" + fileType + ", " + super.toString() + "]";
    }
}
