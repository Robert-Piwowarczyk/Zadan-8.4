public class ProConditioner extends AirConditional {
    public ProConditioner(Room room) {
        super(room);
    }
    public void fireAirConditioner(Room room){
        room.setTemperature(-2.0);
    }
}