package Factory;

public class ActingDevice implements Device {
    boolean isOn = false;

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }
}
