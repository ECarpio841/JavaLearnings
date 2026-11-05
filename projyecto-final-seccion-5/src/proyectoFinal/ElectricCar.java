package proyectoFinal;

public class ElectricCar extends Car implements Electric{
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("El auto eléctrico está encendido...");
    }


    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Bateria cargada");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}
