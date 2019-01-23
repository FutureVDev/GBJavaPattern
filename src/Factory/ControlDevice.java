package Factory;

import java.util.ArrayList;
import java.util.List;

public class ControlDevice implements Device{
    boolean isOn = false;
    List<ActingDevice> contoledDevices = new ArrayList<>();

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    void addControledDevice(ActingDevice device){
        this.contoledDevices.add(device);
    }


}
