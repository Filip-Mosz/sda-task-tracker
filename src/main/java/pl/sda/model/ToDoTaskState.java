package pl.sda.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ToDoTaskState implements ErrandState {
    Task task;
    LocalDateTime created;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    @Override
    public String toString() {
        return "ToDoTaskState{" +
                "task=" + task +
                ", created=" + created.format(dateFormat) +
                '}';
    }

    //    public ToDoTaskState() {
//        this.created = LocalDateTime.now();
//    }
    public ToDoTaskState(Task task) {
        this.task= task;
        this.created = LocalDateTime.now();
        task.setCurrentState(this);
    }

    @Override
    public ErrandState nextState() {
        //ErrandState state = new InProgressTaskState(task,created);
        ErrandState state = new InProgressTaskState(task,created);

        this.task.setCurrentState(state);
        return state;
    }

    @Override
    public ErrandState previousState() {
        return this;
    }

    @Override
    public String getMessage() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        return "ToDo - " + created.format(dateFormat);
    }
    //a. Klasa ToDoTaskState:
    //   done Powinna zaimplementować metodę nextState():
    //         tak aby zwracać nowy obiekt typu InProgressTaskState (do konstruktora przekaż zadanie z tego statusu) i ustawić task.setCurrentState na nowo utworzony obiekt.
    //   done Powinna zaimplementować metodę prevState():
    //         tak aby zwracać ten sam status, bo nie da się z ToDo przejść do tyłu, a więc powinna zwracać "this"
    //   done getMessage() powinno zwracać "ToDo - <czas utworzenia zadania>"
}
