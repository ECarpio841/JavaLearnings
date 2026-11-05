package Inmutabilidad;

public class MainHouse {
    static void main(String[] args) {
        House house = new House(2,2,2);
        System.out.println("house.getDoors() = " + house.getDoors());

    }
}
