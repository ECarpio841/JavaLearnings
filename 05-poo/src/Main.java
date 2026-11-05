public class Main {
    public static void main(String[] args) {
 /*       Vehicle vehicle = new Vehicle("Toyotin", "Creta", 2000);

        vehicle.setYear(2001);
        System.out.println(vehicle.toString());

  */


        Vehicle myCar = new Car("Toyota", "Creta", 1993, 4);
        Vehicle motorcycle = new Motorcycle("Ducati", "Storm", 2025, false);

        ((Car)myCar).start();
        ((Motorcycle)motorcycle).start();
        printVehicle(motorcycle);
        printVehicle(myCar);
    }

    public static void printVehicle(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }
}