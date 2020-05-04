public class Room {
    private double temperature;
    private int roomNumber;
    private AirConditional airConditional;

    public Room(double temperature, int roomNumber, AirConditional airConditional) {
        this.temperature = temperature;
        this.roomNumber = roomNumber;
        this.airConditional = airConditional;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public AirConditional getAirConditional() {
        return airConditional;
    }

    public void setAirConditional(AirConditional airConditional) {
        this.airConditional = airConditional;
    }

    public void lowerTemperature() {
        if(temperature>20)
            airConditional.fireAirConditioner(this);
    }
}
