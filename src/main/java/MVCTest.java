public class MVCTest {
    public static void main(String[] args) {
        RoomClimat rc = new RoomClimat("Kitchen");
        rc.setWetness(15);
        rc.setTemperature(25);

        RoomClimatView rcv = new RoomClimatView();

        RoomClimatControler rcc = new RoomClimatControler(rc,rcv);

        rcc.updateView();

        rcc.setRoomTemperature(20);

        rcc.updateView();
    }
}
