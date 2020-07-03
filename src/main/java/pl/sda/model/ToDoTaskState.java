package pl.sda.model;

public class ToDoTaskState implements ErrandState{
    Task task;

    public ToDoTaskState() {
    }

    @Override
    public ErrandState nextState() {
        //zwracać nowy obiekt typu InProgressTaskState
        //   (do konstruktora przekaż zadanie z tego statusu)
        //                                i ustawić task.setCurrentState na nowo utworzony obiekt.
        ErrandState state = new InProgressTaskState();


        return state;
    }

    @Override
    public ErrandState previousState() {
        return this;
    }

    @Override
    public String getMessage() {
        return null;
    }
    //a. Klasa ToDoTaskState:
    //   * Powinna zaimplementować metodę nextState():
    //   tak aby
    //                          * Powinna zaimplementować metodę prevState():
    //                                tak aby zwracać ten sam status, bo nie da się z ToDo przejść do tyłu, a więc powinna zwracać "this"
    //                          * getMessage() powinno zwracać "ToDo - <czas utworzenia zadania>"
}
