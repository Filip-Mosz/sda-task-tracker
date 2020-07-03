package pl.sda.model.tools;

import pl.sda.model.Priority;

public class PriorityConverter {
    Priority priority;

    public PriorityConverter(String priority) {
        this.priority = convert(priority);
    }

    public static Priority convert(String input){
        String inputPriority = input.toUpperCase();
        return Priority.valueOf(inputPriority);
    }
}
