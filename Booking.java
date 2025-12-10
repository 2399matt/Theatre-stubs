 

/**
 * Booking class is used to store all the critical data of a show for a given customer.
 * Bookings hold onto a customer,  a show, and the seat that the customer is in.
 * Provides utility for quick lookup in a centralized location.
 */
public class Booking {

    private Customer customer;
    private Show show;

    public Booking(Customer customer, Show show) {
        this.customer = customer;
        this.show = show;
    }

    /**
     * Method to retrieve the relevant show of the booking.
     *
     * @return The show the booking is for.
     */
    public Show getShow() {
        return show;
    }

    /**
     * Method to retrieve the customer that made the booking.
     *
     * @return The customer who created the booking.
     */
    public Customer getCustomer() {
        return customer;
    }
}
