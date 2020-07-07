package pl.sda.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
@Getter
@Setter
public class Task extends BaseErrand{

    private Duration estimatedTimeOfComlpetion;
    ErrandState currentState;

    public Task() {
    }

    public Task(String title, String priority, long estimatedTimeOfComlpetion) {
        super(title, priority);
        this.estimatedTimeOfComlpetion = Duration.ofDays(estimatedTimeOfComlpetion);
    }

    public ErrandState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ErrandState currentState) {
        this.currentState = currentState;
    }
}
