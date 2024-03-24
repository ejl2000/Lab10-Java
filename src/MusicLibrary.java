import java.util.ArrayList;

/**
 * Represents a music library that holds various types of media.
 * This class allows adding media, displaying the contents of the library, and playing media by title.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris H.
 * @version 1.0
 */
public class MusicLibrary
{
    private final ArrayList<MusicMedia> musicLibrary; // ArrayList to store the media in the library

    /**
     * Constructs an empty MusicLibrary.
     * Initializes the ArrayList to store media.
     */
    public MusicLibrary()
    {
        this.musicLibrary = new ArrayList<>();
    }

    /**
     * Adds a piece of media to the library.
     *
     * @param media The media to add.
     */
    public void addMedia(final MusicMedia media)
    {
        if (media != null) { // Check if the media object is not null
            musicLibrary.add(media); // Add the media to the library
        }
    }

    /**
     * Displays the contents of the library.
     * Iterates through the media in the library and prints their string representations.
     */
    public void displayLibrary()
    {
        for (final MusicMedia media : musicLibrary)
        { // Iterate through the media in the library
            System.out.println(media.toString()); // Print the string representation of each media
        }
    }

    /**
     * Plays the section of a media with the specified title.
     *
     * @param title the title of the media to play
     */
    public void playTitle(final String title)
    {
        if (title == null || title.isEmpty())
        { // Check if the title is null or empty
            System.err.println("Invalid title provided."); // Print an error message
        }

        boolean found;
        found = false; // Flag to indicate if the title is found

        for (final MusicMedia media : musicLibrary)
        { // Iterate through the media in the library
            if (media.getSongTitle().equals(title))
            { // Check if the title matches the media's title
                media.playSection(); // Play the section of the media
                found = true; // Set the flag to true
                break; // Exit the loop
            }
        }

        if (!found)
        { // If the title is not found
            System.out.println("Title '" + title + "' not found in the library."); // Print a message indicating the title was not found
        }
    }
}
