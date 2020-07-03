package pl.sda.model.tools;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class StringToLocalDateTimeConverter {
    public static LocalDateTime convert(String givenString) {

        //String[] timeString = timeOfSolution.split(",|.|-| |:|;");
        String[] timeString = givenString.split("[,.:; -]");
        int tabLength = timeString.length;
        int[] time = new int[tabLength];

        for (int i = 0; i < tabLength; i++) {
            time[i] = Integer.parseInt(timeString[i]);
        }
        try{
            return LocalDateTime.of(time[0], time[1], time[2], time[3], time[4]);
        } catch (DateTimeException e) {
            System.err.println("Niewłaściwy format daty\nwprowadzam datę dodania");
            return LocalDateTime.now();
        }

    }
}
