package bridge;

public class Heater implements Device {
    boolean isOn =  false;
    int level = 0;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOff() {
        isOn = false;

    }

    @Override
    public void turnOn() {
        isOn = true;

    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void turnLevelUp() {
        level += 1;

    }

    @Override
    public void turnLevelDown() {
        level -= 1;

    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
