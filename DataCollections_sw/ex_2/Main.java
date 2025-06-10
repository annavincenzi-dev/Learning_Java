package ex_2;

import java.util.HashSet;
import java.util.Set;

import model.Person;

public class Main {
    public static void main(String[] args) {
        Person pinco1 = new Person("Pinco", 12);
        Person pinco2 = new Person("Pinco", 12);
        Person pallino = new Person("Pallino", 12);
        Person pincopallino = new Person("Pincopallino", 24);
        Set<Person> persone = new HashSet<>();

        persone.add(pinco1);
        persone.add(pinco2);
        persone.add(pallino);
        persone.add(pincopallino);

        /* L'OUTPUT è CORRETTAMENTE SENZA DUPLICATI */
        System.out.println(persone);
    }

}
