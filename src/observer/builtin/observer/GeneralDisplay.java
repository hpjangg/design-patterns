package observer.builtin.observer;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer, DisplayElement {

    private Observable observable;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        display();
    }

    @Override
    public void display() {
        System.out.println("General Display");
    }
}
