package ex_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, Person> persone = new HashMap<>();
        boolean exit = false;

        /* LISTA INIZIALE (DI DEFAULT) */
        persone.put("pippo", new Person("Pippo", 12));
        persone.put("pluto", new Person("Pluto", 12));
        persone.put("paperino", new Person("Paperino", 24));

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Benvenuta nel mio esperimento di mappatura utenti con Java!");
        Thread.sleep(300);
        while (!exit) {
            System.out.println("");
            System.out.println("Cosa vuoi fare?");
            Thread.sleep(300);
            System.out.println("1- Aggiungi utente");
            Thread.sleep(300);
            System.out.println("2- Visualizza la mappa completa!");
            Thread.sleep(300);
            System.out.println("3- Modifica un utente esistente");
            Thread.sleep(300);
            System.out.println("4- Esci");

            String input0 = scanner.nextLine().toLowerCase();
            Thread.sleep(300);
            switch (input0) {
                case "1":
                    aggiungiUtente(persone, scanner);
                    break;
                case "2":
                    visualizzaMappa(persone);
                    break;
                case "3":
                    modificaUtente(persone, scanner);
                    break;
                case "4":
                    exit = true;
                    break;
                default:
                    System.out.println("Comando non riconosciuto, riprova!");
                    break;
            }
        }

        scanner.close();
    }

    private static void visualizzaMappa(Map<String, Person> persone) throws Exception {
        System.out.println("");
        System.out.println("Mappa completa: ");
        for (Person p : persone.values()) {
            System.out.println(p);
            Thread.sleep(300);
        }
    }

    private static void aggiungiUtente(Map<String, Person> persone, Scanner scanner) throws Exception {
        System.out.println("");
        System.out.println("Inserisci il nome: ");
        String input1 = scanner.nextLine();

        System.out.println("Inserisci l'eta': ");
        int input2 = Integer.parseInt(scanner.nextLine());

        persone.put(input1.toLowerCase(), new Person(input1, input2));

        Thread.sleep(300);
        System.out.println("");
        System.out.println("Mappa aggiornata con successo! Nuova lista: ");
        for (Person p : persone.values()) {
            System.out.println(p);
            Thread.sleep(300);
        }
    }

    private static void modificaUtente(Map<String, Person> persone, Scanner scanner) throws Exception {
        System.out.println("");
        System.out.println("Quale utente vuoi modificare?");
        String input4 = scanner.nextLine().toLowerCase();

        boolean found = persone.containsKey(input4);
        if (found) {
            Thread.sleep(500);
            System.out.println("Utente trovato!" + persone.get(input4));
            Thread.sleep(300);
            System.out.println("Cosa vuoi fare?");
            Thread.sleep(300);
            System.out.println("1- Modifica utente");
            Thread.sleep(300);
            System.out.println("2- Elimina utente");
            String input5 = scanner.nextLine().toLowerCase();

            Thread.sleep(300);
            System.out.println("");
            switch (input5) {
                case "1":

                    System.out.println("Inserisci il nuovo nome: ");
                    String input1 = scanner.nextLine();

                    System.out.println("Inserisci la nuova eta': ");
                    int input2 = Integer.parseInt(scanner.nextLine()); // FIX

                    persone.get(input4).setName(input1);
                    persone.get(input4).setAge(input2);

                    System.out.println("");
                    System.out.println("Mappa aggiornata con successo! Nuova lista: ");
                    for (Person p : persone.values()) {
                        System.out.println(p);
                        Thread.sleep(300);
                    }
                    break;
                case "2":
                    persone.remove(input4);
                    System.out.println("Mappa aggiornata con successo! Nuova lista: ");
                    for (Person p : persone.values()) {
                        System.out.println(p);
                        Thread.sleep(300);
                    }
                    break;
            }
        }
    }
}
