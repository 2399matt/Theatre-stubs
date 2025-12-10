import java.util.List;

/**
 * Movie class is used to represent a movie.
 * Movies contain titles, runtime lengths, parental ratings, and genres.
 */
public class Movie {

    private List<String> genres;
    private String title;
    private int runTimeLength;
    private String parentalRating;

    public Movie(List<String> genres, String title, int runTimeLength, String parentalRating) {
        this.genres = genres;
        this.title = title;
        this.runTimeLength = runTimeLength;
        this.parentalRating = parentalRating;
    }

    /**
     * Method to retrieve the genres of a given movie. Must be a list,
     * movies can have more than one genre.
     *
     * @return The genres that the movie falls under.
     */
    public List<String> getGenres() {
        return genres;
    }

    /**
     * Method to retrieve the title of a movie.
     *
     * @return The title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to retrieve the runtime length of a movie.
     *
     * @return The runtime length of the movie.
     */
    public int getRunTimeLength() {
        return runTimeLength;
    }

    /**
     * Method to retrieve the parental rating of the movie.
     *
     * @return The parental rating of the movie.
     */
    public String getParentalRating() {
        return parentalRating;
    }
}
