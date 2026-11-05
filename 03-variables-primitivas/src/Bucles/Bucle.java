package Bucles;

public class Bucle {
    public static void main(String[] args) {




        for(int i=2; i<=5; i+=2){
            System.out.println("Valor: " + i);
        }
        System.out.println("SALE");







        int counter = 0;
        int acumulador = 0;


        while (counter < 5){
            System.out.println("counter = " + counter);
            acumulador += counter;
            counter ++;

        }

        System.out.println("acumulador= " + acumulador);

        int counter2 = 0;
        do {
            System.out.println("counter2 = " + counter2);
            counter2++;
        }while(counter2<5);


    }

}


