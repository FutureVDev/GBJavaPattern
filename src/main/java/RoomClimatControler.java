public class RoomClimatControler {
    private RoomClimat model;
    private RoomClimatView view;

    public RoomClimatControler(RoomClimat model, RoomClimatView view) {
        this.model = model;
        this.view = view;
    }

    public void setRoomTemperature(int temperature){
        model.setTemperature(temperature);
    }

    public int getRoomTemperature(){
        return model.getTemperature();
    }

    public void setRoomWetness(int wetness){
        model.setWetness(wetness);
    }

    public int getRoomWetness(){
        return model.getWetness();
    }

    public void updateView(){
        view.printRoomClimatDetails(model.getRoomName(),model.getTemperature(),model.getWetness());
    }
}
