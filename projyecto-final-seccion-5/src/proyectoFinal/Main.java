package proyectoFinal;

public class Main {

    static void main(String[] args) {

        Vehicle myCar = new Car("Fiat", "Duna", 2023, CarType.SPORTS);
        Vehicle myElectricCar = new ElectricCar("Tesla", "Model 3", 2022, CarType.TRUCK, 100);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar)myElectricCar).chargeBattery();

        System.out.println(myElectricCar);
        System.out.println(myCar);
    }
}
