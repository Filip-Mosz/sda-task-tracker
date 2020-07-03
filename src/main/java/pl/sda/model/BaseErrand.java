package pl.sda.model;

import pl.sda.model.tools.PriorityConverter;

import java.time.LocalDateTime;

public abstract class BaseErrand {
    String title;
    Priority priority;
    LocalDateTime dateOfAddition;

    public BaseErrand(String title, String priority) {
        this.title = title;
        this.priority = PriorityConverter.convert(priority);
        this.dateOfAddition = LocalDateTime.now();
    }

    public BaseErrand() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = PriorityConverter.convert(priority);
    }

    public LocalDateTime getDateOfAddition() {
        return dateOfAddition;
    }

    public void setDateOfAddition(LocalDateTime dateOfAddition) {
        this.dateOfAddition = dateOfAddition;
    }
}
