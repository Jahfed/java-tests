package OOB.TheCar;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        // if (engine != null) {
        engine.start();
        // } else {
        // System.out.println("Engine not selected.");
        // }
    }
}