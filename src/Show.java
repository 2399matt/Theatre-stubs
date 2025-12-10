import java.time.LocalDateTime;
import java.util.List;

/**
 * Show class represents the showing of a movie in a theater.
 * Stores the rows of the theater, the start time, and movie
 * for a given show to be played in the theater.
 */
public class Show {
    private List<Row> rows;
    private LocalDateTime startTime;
    private Movie playingMovie;

    public Show(List<Row> rows, LocalDateTime startTime, Movie playingMovie) {
        this.rows = rows;
        this.startTime = startTime;
        this.playingMovie = playingMovie;
    }

    /**
     * Method to access the rows of a theater for a given Show.
     *
     * @return The list of rows for the theater.
     */
    public List<Row> getRows() {
        return rows;
    }

    /**
     * Method to retrieve the start time of the show.
     *
     * @return The start time of the Show.
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * Method to retrieve the movie that will be playing in a Show.
     *
     * @return The movie that will be playing for the Show.
     */
    public Movie getPlayingMovie() {
        return playingMovie;
    }
}
