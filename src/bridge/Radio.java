package bridge;

public class Radio implements Device {
    boolean isOn = false;
    //в данном случае уровень звука
    int level = 0;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOff() {
        this.isOn = false;

    }

    @Override
    public void turnOn() {
        this.isOn = true;

    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void turnLevelUp() {
        level += 10;

    }

    @Override
    public void turnLevelDown() {
        level -= 10;

    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
