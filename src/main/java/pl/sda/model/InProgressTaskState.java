package pl.sda.model;
//* Powinna mieć pole przechowujące czas utworzenia obiektu(created)
//    * Powinna zaimplementować metodę nextState():
//          tak aby zwracać nowy obiekt typu DoneTaskState (do konstruktora przekaż zadanie z tego statusu) i ustawić task.setCurrentState na nowo utworzony obiekt.
//    * Powinna zaimplementować metodę prevState():
//          tak aby zwracać nowy obiekt typu ToDoTaskState (do konstruktora przekaż zadanie z tego statusu) i ustawić task.setCurrentState na nowo utworzony obiekt.
//    * getMessage() powinno zwracać "In progress - <czas teraz - czas utworzenia obiektu>"

import java.time.LocalDateTime;

public class InProgressTaskState implements ErrandState {
    Task task;
    LocalDateTime created;

    @Override
    public ErrandState nextState() {
        return new DoneTaskState();
    }

    @Override
    public ErrandState previousState() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
