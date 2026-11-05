package scannerExample;

import java.util.Scanner;

public class NumberCompare {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int b = scanner.nextInt();

        int sum = a + b;
        int dif = a - b;

        System.out.println("La suma de a - b es = " + sum);
        System.out.println("La diferencia de a - b es = " + dif);

        if (a>b){
            System.out.println("El primer número es mayor");
        }else {
            System.out.println("El segundo es mayor o igual");
        }

        System.out.println(" Fin de la aplicación " );

        scanner.close();
    }
}
