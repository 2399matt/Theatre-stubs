/**
 * Row class is used to represent the rows of a theater.
 * A row contains an array of seats, each holding onto a customer.
 */
public class Row {

    private Seat[] seats;

    public Row(Seat[] seats) {
        this.seats = seats;
    }

    /**
     * Method to retrieve all the seats in a given row.
     *
     * @return The seats in a row.
     */
    public Seat[] getSeats() {
        return seats;
    }
}
