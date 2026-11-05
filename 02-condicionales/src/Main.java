class main{
    public static void main(String[] args){

        int edad = 17;

        /*
        if (edad >= 18){
            System.out.println("Puedes ingresar a la fiesta");
        } else {
            System.out.println("NO PUEDES INGRESAR");
        }
        */

        // Tiene 5 años o menos imprimir = NIÑO
        // Tiene 12 años o menos imprimir= ESCOLAR
        // Tiene 17 años o menos imprimir = Adolescente
        // Tiene 18 años en adelante imprimir = ADULTO;


        int edad2 = 19;
        if (edad2 <= 5){
            System.out.println("NIÑO");
        } else if(edad2 <= 12) {
            System.out.println("ESCOLAR");
        } else if (edad2 <= 17){
            System.out.println("ADOLESCNETE");
        } else {
            System.out.println("ADULTO");
        }


        // AND operador de multiplicación lógica == &&
        // Utilizamo cuando necesitamos que dos condiciones sean verdaderas al mismo tiempo

        int edad3 = 90;

        //IMPRIMIR EL MENSAJE = TIENE ENTRE 18 Y 30 AÑOS
        if (edad3 >= 18 && edad3 <= 30){
            System.out.println("TIENE ENTRE 18 Y 30 AÑOS");
        }else {
            System.out.println("EDAD NO PERMITIDA ENTRE LOS LÍMITES");
        }

        // EVALUAR SI ES MAYOR DE EDAD Y SI TIENE ENTRADA
        int edad4 = 20;
        boolean tieneEntrada = true;

        if(edad4 >= 18 && tieneEntrada){
            System.out.println("Puede Ingresar");
        } else {
            System.out.println("No puede ingresar");
        }




    }
}
