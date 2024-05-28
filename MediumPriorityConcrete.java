import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MediumPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().plus(1, ChronoUnit.MONTHS).format(DateTimeFormatter.ISO_DATE);
    }

    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + this.expireDay);
    }
}
