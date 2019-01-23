package Factory;

public class DeviceFactory {
    public static Device getDevice(String type){
        if(type.equals("measure_device")) return new MeasuringDevice();
        else if (type.equals("control_device")) return new ControlDevice();
        else if (type.equals("acting_device")) return new ActingDevice();
        return null;
    }
}
