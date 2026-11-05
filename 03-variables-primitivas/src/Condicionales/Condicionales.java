package Condicionales;

public class Condicionales {
    public static void main(String[] args) {


        double average = 7.5;
        int age = 19;
        boolean isAdult= age > 18;
        boolean hasPassingGrade = average >= 7;



        if(isAdult  && hasPassingGrade){
            System.out.println("Es estudiante cumple con todos los requisitos");
        }


        if (isAdult){
            System.out.println(" Es un adulto" );
        }

        /*
        int day = 30;

        switch (day) {
            case 1:
                System.out.println(" Lunes");
                break;
            case 2:
                System.out.println(" Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default :
                System.out.println("Dato " );
        }

         */

    }
}
