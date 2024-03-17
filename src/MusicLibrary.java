import java.util.ArrayList;

/**
 * Represents a music library class.
 *
 * @author Emma, Samson
 * @version 2024
 */
class MusicLibrary
{
    private final ArrayList<MusicMedia> library;

    /**
     * Constructs a MusicLibrary object.
     */
    public MusicLibrary()
    {
        this.library = new ArrayList<>();
    }

    /**
     * Adds a piece of music media to the library.
     *
     * @param media The music media to add.
     */
    public void addMedia(final MusicMedia media)
    {
        if (media != null)
        {
            library.add(media);
        }
    }

    /**
     * Displays the entire music library.
     */
    public void displayLibrary()
    {
        for (MusicMedia media : library)
        {
            System.out.println(media.toString());
        }
    }

    /**
     * Plays the specified title from the library.
     *
     * @param title The title of the music to play.
     */
    public void playTitle(final String title)
    {
        for (MusicMedia media : library)
        {
            if (media.getTitle().equals(title))
            {
                media.playSelection();
                return;
            }
        }
        System.out.println("Title not found in the library.");
    }
}
