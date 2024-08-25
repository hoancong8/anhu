import java.time.Duration;
import java.time.LocalTime;

public class CalculateTime {
    private LocalTime now;
    private LocalTime startTime;
    private Long time;
    public CalculateTime(){
        now = LocalTime.now();
        startTime = LocalTime.MIDNIGHT;
        time = Duration.between(startTime,now).toMillis();
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public LocalTime getNow() {
        return now;
    }

    public void setNow(LocalTime now) {
        this.now = now;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
}
