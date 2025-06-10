package ex_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Person> persone = new ArrayList<>();

        persone.add(new Person("Pinco", 12));
        persone.add(new Person("Pinco", 12));
        persone.add(new Person("Pallino", 12));
        persone.add(new Person("Pincopallino", 24));
        persone.add(new Person("Pippo", 24));
        persone.add(new Person("Pluto", 24));
        persone.add(new Person("Pallino", 12));
        persone.add(new Person("Pincopallino", 24));
        persone.add(new Person("Pippo", 24));
        persone.add(new Person("Pluto", 24));
        persone.add(new Person("Paperino", 24));

        System.out.println("Lista con duplicati:");
        for (Person p : persone) {
            System.out.println(p);
        }

        Set<Person> personeSet = new HashSet<>(persone);
        System.out.println("Lista senza duplicati:");
        for (Person p : personeSet) {
            System.out.println(p);
        }
    }
}
