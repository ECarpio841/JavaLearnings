public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private Engine engine;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = new Engine();
    }

    public void start(){
        System.out.println("Encendido");
        engine.start();
    }

    public void stop(){
        System.out.println("Parar");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        int currentYear = java.time.Year.now().getValue();

        if(year < 1886 || year > currentYear + 2){
            throw new IllegalArgumentException("Año inválido");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
