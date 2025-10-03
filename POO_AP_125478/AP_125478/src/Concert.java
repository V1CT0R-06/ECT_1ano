import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Concert {
    private static int nextId = 1;
    private int id;
    private double durationInMinutes;
    private String location;
    private LocalDateTime startDateTime;

    public Concert(double durationInMinutes, String location, LocalDateTime startDateTime) {
        this.id = nextId++;
        this.durationInMinutes = durationInMinutes;
        this.location = location;
        this.startDateTime = startDateTime;
    }

    public int getId() {
        return id;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return String.format("Concert #%d | Duration: %.1f min | Location: %s | Starts: %s",
                id, durationInMinutes, location, startDateTime.format(formatter));
    }
}