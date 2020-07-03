package pl.sda.model;

public interface ErrandState {
//    Utwórz intefrejs ErrandState z metodami:
//            * ErrandState nextState()
//                * ErrandState prevState()
//                * String getMessage();
    public ErrandState nextState();

    public ErrandState previousState();

    public String getMessage();
}
