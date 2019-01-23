package Factory;

public class MeasuringDevice implements Device {
    boolean isOn = false;
    int level = 0;

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    int getLevel(){
        return this.level;
    }

}
