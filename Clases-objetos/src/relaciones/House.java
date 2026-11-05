package relaciones;

public class House {
    private Room room; //composición
    private Door door; //
    private Propietario propietario; //asociación

    public House(Room room, Door door, Propietario propietario) {
        this.room = room;
        this.door = door;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", propietario=" + propietario +
                '}';
    }
}
