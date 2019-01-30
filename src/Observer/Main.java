package Observer;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        sensor.addObserver(new HeaterObserver(0, true));

        sensor.setLevel(15);

    }
}
