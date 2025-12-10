/**
 * Customer class represents a patron of the theater.
 * A customer only needs to contain a phone number, and will be placed in a seat.
 */
public class Customer {

    private String phoneNumber;

    public Customer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method to retrieve the phone number of a customer.
     *
     * @return The phone number of the customer.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
