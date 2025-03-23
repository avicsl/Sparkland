
import java.util.PriorityQueue;

public class TicketManager {
    private static TicketManager instance;
    public PriorityQueue<Ticket> ticketQueue;
    private static final int MAX_TICKETS = 10; 

    private TicketManager() {
        ticketQueue = new PriorityQueue<>((t1, t2) -> {
            int priority1 = getPassPriority(t1.getPassType());
            int priority2 = getPassPriority(t2.getPassType());
            int priorityComparison = Integer.compare(priority1, priority2);

            if (priorityComparison != 0) {
                return priorityComparison;
            } else {
                return t1.getTimestamp().compareTo(t2.getTimestamp());
            }
        });
    }

    public static synchronized TicketManager getInstance() {
        if (instance == null) {
            instance = new TicketManager();
        }
        return instance;
    }

    public boolean isQueueFull() {
        return ticketQueue.size() >= MAX_TICKETS;
    }

    public int remainingTickets() {
        return MAX_TICKETS - ticketQueue.size();
    }

    private int getPassPriority(String passType) {
        switch (passType) {
            case "Spark Elite Pass", "Glow Pass":
                return 1; // Highest priority
            case "Twinkle Pass", "Radiance Pass":
                return 2; // Lower priority
            default:
                return Integer.MAX_VALUE; // For unknown pass types
        }
    }
}

