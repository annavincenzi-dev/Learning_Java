package ex_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Person;

public class Main {

    public static void main(String[] args) {
        Map<String, Person> persone = new HashMap<>();

        persone.put("pinco", new Person("Pinco", 12));
        persone.put("pallino", new Person("Pallino", 12));
        persone.put("pincopallino", new Person("Pincopallino", 24));

        System.out.println("Inserisci il nome da cercare: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        boolean found = persone.containsKey(input);
        if (found) {
            System.out.println("Trovato! " + persone.get(input));
        } else {
            System.out.println("Non trovato nella mappa!");
        }
    }

}
