package bridge;

public class Remote {
    public Device device;

    public void Remote (Device device){
        this.device = device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void turnUp(){
        device.turnLevelUp();
    }

    public void turnDown(){
        device.turnLevelDown();
    }

    public void turnOn(){
        if (!device.isOn()) device.turnOn();
        else System.out.println("already on");
    }

    public void turnOff(){
        if(device.isOn()) device.turnOff();
        else System.out.println("allready off");
    }


}
