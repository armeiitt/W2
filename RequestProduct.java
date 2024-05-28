import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public interface RequestProduct {
    void setPriority();

    void setStatus();

    void setExpire();

    void processRequest();
}
