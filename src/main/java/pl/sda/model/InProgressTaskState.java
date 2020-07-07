package pl.sda.model;
//* Powinna mieć pole przechowujące czas utworzenia obiektu(created)
//    done Powinna zaimplementować metodę nextState():
//          tak aby zwracać nowy obiekt typu DoneTaskState (do konstruktora przekaż zadanie z tego statusu) i ustawić task.setCurrentState na nowo utworzony obiekt.
//    done Powinna zaimplementować metodę prevState():
//          tak aby zwracać nowy obiekt typu ToDoTaskState (do konstruktora przekaż zadanie z tego statusu) i ustawić task.setCurrentState na nowo utworzony obiekt.
//    done* getMessage() powinno zwracać "In progress - <czas teraz - czas utworzenia obiektu>"

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InProgressTaskState implements ErrandState {
    Task task;
    LocalDateTime created;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    public InProgressTaskState(Task task, LocalDateTime created) {
        this.task = task;
        this.created = created;
    }

    @Override
    public ErrandState nextState() {
        ErrandState state = new DoneTaskState(task,created);

        task.setCurrentState(state);
        return state;

    }

    @Override
    public ErrandState previousState() {
        ErrandState state = new ToDoTaskState(task);

        task.setCurrentState(state);
        return state;
    }

    @Override
    public String getMessage() {

        return " In progress - " + LocalDateTime.now().format(dateFormat) + " - " + created.format(dateFormat);
    }

    @Override
    public String toString() {
        return "InProgress - <" + LocalDateTime.now().format(dateFormat) + " - " + created.format(dateFormat) +
                '>';
    }
}
