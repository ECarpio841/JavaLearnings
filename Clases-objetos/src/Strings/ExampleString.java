package Strings;

public class ExampleString {

    static void main(String[] args) {
        String name = "Grabriel";
        String name2 = "Matias";
        System.out.println("name = " + name);
        System.out.println(name.equals(name2));

        Person persona1 = new Person("Esteban", "Carpio");

        System.out.println(persona1.toString());
    }


}
