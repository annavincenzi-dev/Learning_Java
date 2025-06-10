package ex_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, Person> persone = new HashMap<>();

        persone.put("pinco", new Person("Pinco", 12));
        persone.put("pallino", new Person("Pallino", 12));
        persone.put("pincopallino", new Person("Pincopallino", 24));
        persone.put("pippo", new Person("Pippo", 24));
        persone.put("pluto", new Person("Pluto", 24));
        persone.put("paperino", new Person("Paperino", 24));

        System.out.println("Ecco le persone registrate!");
        Thread.sleep(500);
        /* Stampo solo i valori senza chiave!! */
        for (Person p : persone.values()) {
            System.out.println(p);
            Thread.sleep(500);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale persona vorresti modificare?");
        String input1 = scanner.nextLine().toLowerCase();

        boolean found = persone.containsKey(input1);
        if (found) {
            System.out.println("Nuovo nome: ");
            String input2 = scanner.nextLine();

            persone.get(input1).setName(input2);

            System.out.println("Nuova età: ");
            int input3 = scanner.nextInt();

            persone.get(input1).setAge(Integer.valueOf(input3));

            Thread.sleep(500);
            System.out.println("Persona modificata con successo. Ecco la mappa aggiornata: ");
            for (Person p : persone.values()) {
                System.out.println(p);
                Thread.sleep(500);
            }
        } else {
            System.out.println("Persona non trovata!");
        }

        scanner.close();
    }

}
