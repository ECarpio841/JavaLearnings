package ProyectoFinal;

public class Main {

    static void main(String[] args) {
        BankAccout bankAccout = new BankAccout("Juan Perez", 1000000.0);
        BankApp bankApp = new BankApp(bankAccout);
        bankApp.start();
    }
}
