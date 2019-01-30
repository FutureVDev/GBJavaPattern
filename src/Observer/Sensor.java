package Observer;

public class Sensor extends SubjectDevice {
    int level = 0;

    public int getLevel(){
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        notify(level);
    }
}
