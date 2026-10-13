
class Cinema {
    String movie, customer;
    double price;
    int tickets;

    Cinema(String c, String m, double p, int t) {
        customer = c.toUpperCase();
        movie = m.toUpperCase();
        price = p;
        tickets = t;
    }

    Cinema(String c, String m, int t) {
        this(c, m, 200, t);
    }

    void book(int t) {
        tickets = t;
        display();
    }

    void book() {
        display();
    }

    void display() {
        System.out.println("\nCustomer Name   : " + customer);
        System.out.println("Movie Name      : " + movie);

        if (tickets <= 0) {
            System.out.println("Booking Status  : Invalid Tickets");
            return;
        }

        double total = price * tickets;
        double discount = tickets >= 5 ? total * 0.10 : 0;

        System.out.printf("Ticket Price    : Rs. %.2f%n", price);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Booking Status  : Booking Successful");
        System.out.printf("Total Amount    : Rs. %.2f%n", total);
        System.out.printf("Discount        : Rs. %.2f%n", discount);
        System.out.printf("Final Amount    : Rs. %.2f%n", total - discount);
    }

    public static void main(String[] args) {
        System.out.println("========== CINEMA TICKET BOOKING ==========");

        Cinema c1 = new Cinema("Sneha", "Avatar", 200, 5);
        c1.book();

        Cinema c2 = new Cinema("Arjun", "Avatar", 2);
        c2.book();

        System.out.println("\nSame Customer: " +
                c1.customer.equals(c2.customer));
    }
}
