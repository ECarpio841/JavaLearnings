package ProyectoFinal;

import java.util.Scanner;

public class ProyectoFinal {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean repeat;
        do {

            System.out.println("Bienvenido Ingresa tu edad:");
            int edad = scanner.nextInt();
            System.out.println("Tu edad es: "+ edad);

            System.out.println("Ingresa tus calificaciones");
            int notaUno = scanner.nextInt();
            int notaDos = scanner.nextInt();
            int notaTres = scanner.nextInt();

            double average = (notaUno + notaDos + notaTres) / 3.0;
            final int minimumGrade = 6;

            if (average >= minimumGrade) {
                System.out.println(" Su nota es: " + average + " PASA DE CURSO");
            } else {
                System.out.println(" Su nota es: " + average + " REPROBADO");
            }

            System.out.println(" Ingresar nuevas ntas? 1)si, 0)no ");
            int option = scanner.nextInt();
            repeat = option ==1;
        }while (repeat);


        System.out.println(" FIN DEL PROGRAMA" );

        scanner.close();



    }

}
