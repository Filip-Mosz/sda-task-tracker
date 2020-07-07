package pl.sda.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//done Powinna mieć pole przechowujące czas utworzenia obiektu(created)
//done Powinna zaimplementować metodę nextState():
//      tak aby zwracać ten sam status, bo nie da się z Done przejść do przodu, a więc powinna zwracać "this"
//done Powinna zaimplementować metodę prevState():
//      tak aby zwracać nowy obiekt typu InProgressTaskState (do konstruktora przekaż zadanie z tego statusu) i ustawić task.setCurrentState na nowo utworzony obiekt.
//done getMessage() powinno zwracać "Done - <estymowany czas trwania zadania> - <czas utworzenia zadania> - <czas utworzenia obiektu>"
public class DoneTaskState implements ErrandState{
    Task task;
    LocalDateTime created;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    public DoneTaskState(Task task, LocalDateTime created) {
        this.task = task;
        this.created = created;
    }

    public DoneTaskState() {
    }

    @Override
    public ErrandState nextState() {
        return this;
    }

    @Override
    public ErrandState previousState() {
        ErrandState state = new InProgressTaskState(task,created);

        task.setCurrentState(state);
        return state;
    }

    @Override
    public String getMessage() {
        return "Done - " + task.getDateOfAddition().format(dateFormat) + " - " + task.getEstimatedTimeOfComlpetion();
    }

    @Override
    public String toString() {
        return "DoneTaskState{" +
                "task=" + task  + created.format(dateFormat) +
                '}';
    }
}
