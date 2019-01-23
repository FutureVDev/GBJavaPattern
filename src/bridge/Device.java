package bridge;

interface Device {



    boolean isOn();
    void turnOff();
    void turnOn();
    int getLevel();
    void turnLevelUp();
    void turnLevelDown();
    void setLevel(int level);



}
