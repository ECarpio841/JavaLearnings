package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = getNumbers(scanner, "Ingrese el primer número");
        int b = getNumbers(scanner, "Ingrese el segundo número");

        printArithmeticOperations(a, b);
        compareNumber(a,b);


    }

    public static int getNumbers (Scanner scanner, String message){
        System.out.println(message);
        int number = scanner.nextInt();
        return number;

    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber){
        System.out.println("La suma de a + b es = " + (firstNumber + secondNumber));
        System.out.println("La diferencia de a - b es = " + (firstNumber - secondNumber));
    }

    public static void compareNumber(int a, int b){
        if (a>b){
            System.out.println("El primer número es mayor");
        }else {
            System.out.println("El segundo es mayor o igual");
        }
    }

    }
