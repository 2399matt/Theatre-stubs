 

/**
 * Seat class represents the seats in a row in a theater.
 * A seat holds onto a customer, as well as a seat number to represent the position
 * in the row/theater.
 */
public class Seat {

    private Customer customer;

    private int seatNumber;

    public Seat(Customer customer, int seatNumber) {
        this.customer = customer;
        this.seatNumber = seatNumber;
    }

    /**
     * Returns the customer that will be sitting in the seat.
     * Would need defense against NPE if a seat is unbooked.
     *
     * @return The customer, if it exists.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Returns the number for the given seat corresponding to the row.
     *
     * @return The seat number.
     */
    public int getSeatNumber() {
        return seatNumber;
    }
}
