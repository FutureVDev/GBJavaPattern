public class RoomClimat {
    private String roomName;
    private int temperature = 0;
    private int wetness = 0;

    public RoomClimat(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {

        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getWetness() {
        return wetness;
    }

    public void setWetness(int wetness) {
        this.wetness = wetness;
    }
}
