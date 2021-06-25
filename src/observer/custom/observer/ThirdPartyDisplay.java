package observer.custom.observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Third Party Display");
    }
}
