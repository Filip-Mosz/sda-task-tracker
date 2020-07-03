package pl.sda.model;

//* Powinna mieć pole przechowujące czas utworzenia obiektu(created)
//* Powinna zaimplementować metodę nextState():
//      tak aby zwracać ten sam status, bo nie da się z Done przejść do przodu, a więc powinna zwracać "this"
//* Powinna zaimplementować metodę prevState():
//      tak aby zwracać nowy obiekt typu InProgressTaskState (do konstruktora przekaż zadanie z tego statusu) i ustawić task.setCurrentState na nowo utworzony obiekt.
//* getMessage() powinno zwracać "Done - <estymowany czas trwania zadania> - <czas utworzenia zadania> - <czas utworzenia obiektu>"
public class DoneTaskState implements ErrandState{
    Task task;

    @Override
    public ErrandState nextState() {
        return null;
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
