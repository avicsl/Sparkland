
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
    private String name;
    private String contactNumber;
    private String bookingDate;
    private String visitDate;
    private String passType;
    private int quantity;
    private String timestamp; // New field for timestamp

    public Ticket(String name, String contactNumber, String bookingDate, String visitDate, String passType, int quantity) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.bookingDate = bookingDate;
        this.visitDate = visitDate;
        this.passType = passType;
        this.quantity = quantity;// In the Ticket class constructor
        this.timestamp = getCurrentTimestamp(); // This should reflect the creation time

    }

    private String getCurrentTimestamp() {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    return sdf.format(new Date());
}

    public String getName() { return name; }
    public String getContactNumber() { return contactNumber; }
    public String getBookingDate() { return bookingDate; }
    public String getVisitDate() { return visitDate; }
    public String getPassType() { return passType; }
    public int getQuantity() { return quantity; }
    public String getTimestamp() { return timestamp; }

    public void setName(String name) { this.name = name; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }
    public void setVisitDate(String visitDate) { this.visitDate = visitDate; }
    public void setPassType(String passType) { this.passType = passType; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
