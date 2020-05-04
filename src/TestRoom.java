public class TestRoom {
    public static void main(String[] args) {
        Room room1 = new Room(21.0, 1, BasicConditioner);
        Room room2 = new Room(20, 2,ProConditioner );
        BasicConditioner basicConditioner = new BasicConditioner(room1);
        ProConditioner proConditioner = new ProConditioner(room2);

        System.out.println("Aktualna temperatura pomieszczenia"
                +basicConditioner.fireAirConditioner(room1));
        System.out.println("Aktualna temperatura pomieszczenia"
                +proConditioner.fireAirConditioner(room2));
    }
}
