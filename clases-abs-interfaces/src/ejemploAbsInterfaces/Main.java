package ejemploAbsInterfaces;

public class Main{

    public static void main(String[] args) {
        /*Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000) {
            @Override
            public void drive() {
                System.out.println("Estoy conduciendo");
            }
        };
        System.out.println(vehicle.toString());*/

        Vehicle electric = new ElectricCar("FIat", "Duna", 2025, Color.BLUE, VehicleStatus.AVAILABLE, 100);

        System.out.println(electric.toString());
    }


}