package pl.sda.model;

import pl.sda.model.tools.StringToLocalDateTimeConverter;

import java.time.LocalDateTime;

public class Bug extends BaseErrand{
    LocalDateTime timeOfSolution;
    ErrandState currentState;

    public Bug() {
        super();
    }

    public Bug(String title, String priority, String timeOfSolution) {
        super(title,priority);
        this.timeOfSolution = StringToLocalDateTimeConverter.convert(timeOfSolution);
    }

    public LocalDateTime getTimeOfSolution() {
        return timeOfSolution;
    }


}
