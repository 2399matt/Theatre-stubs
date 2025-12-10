import java.util.List;

/**
 * Showing class used to store a collection of all shows that will be running in a theater.
 * This class is a utility for the booking-service,
 * and provides access to the needed data about Shows.
 */
public class Showings {

    private List<Show> availableShows;

    public Showings(List<Show> availableShows) {
        this.availableShows = availableShows;
    }

    /**
     * Method to retrieve the list of shows for a theater.
     *
     * @return The list of all available shows.
     */
    public List<Show> getAvailableShows() {
        return availableShows;
    }

    /**
     * Method to add a new Show for the theater. Critical in adding new available movies / times.
     *
     * @param show The show to be added to the available shows list.
     */
    public void addShow(Show show) {
        availableShows.add(show);
    }

}
