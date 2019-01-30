package Observer;

public class HeaterObserver implements Observer {
    private int level = 0;
    private boolean isOn = false;

    public HeaterObserver(int level, boolean isOn) {
        this.level = level;
        this.isOn = isOn;
    }

    @Override
    public void update(SubjectDevice sd, Object od) {
        if(sd instanceof Sensor){
            Sensor sensor = (Sensor) sd;
            int level = sensor.getLevel();

            if (level < 20){
                turnOn();
                setLevel(25);

            }
            if (level > 30){
                turnOff();
            }

        }
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }
}
