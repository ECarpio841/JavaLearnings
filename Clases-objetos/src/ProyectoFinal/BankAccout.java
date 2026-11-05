package ProyectoFinal;

public class BankAccout {
    private String accountHolder;
    private double balance;

    public BankAccout(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Depósito exitoso");
        } else{
            System.out.println("Monto ingresado no es correcto");
        }
    }

    public void withdraw(double amount){

        if (amount > 0 && amount<= balance){
            balance -= amount;
            System.out.println("Retiro existoso");
        } else {
            System.out.println("Fondos insuficientes o monto inválido");
        }

    }

    public void displayBalance(){
        System.out.println(" Saldo " + balance);
    }


}
