package com.devtalles.estructurasdedatos.set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    static void main(String[] args) {
        Set<Person> persons =  new LinkedHashSet<>();

        Person person1 = new Person("Maria", "0107887929");
        Person person2 = new Person("Ana", "0102782497");
        Person person3 = null;


        //create
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        //read
        System.out.println(persons);

        for (Person person : persons){
            if(person!=null) System.out.println(person.name);
        }

        //delete
        persons.remove(person2);

        System.out.println(persons);

        //update
        persons.add(person2);
        System.out.println(persons);


        System.out.println(persons.contains(new Person("Maria", "0107887929")));

    }

}
