public class BasicConditioner extends AirConditional {
    public BasicConditioner(Room room) {
        super(room);
    }

    public void fireAirConditioner(Room room) {
         room.setTemperature(-1.0);
    }
}



