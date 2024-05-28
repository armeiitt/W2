import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
