/**
 * Booking Service class used as the controller for the application.
 * This class has access to showing (access to all shows) for a theater.
 * This is the entry point for the application for the user.
 */
public class BookingService {

    private Showings showings;

    /**
     * default constructor
     *
     * @param showings The showings for a theater.
     */
    public BookingService(Showings showings) {
        this.showings = showings;
    }

    /**
     * Method to retrieve showings for a theater.
     *
     * @return Showings for a theater (can access list of Shows).
     */
    public Showings getShowings() {
        return showings;
    }
}
