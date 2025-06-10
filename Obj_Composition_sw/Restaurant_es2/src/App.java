import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurant pizzeria = new Restaurant("Pizzeria Stella");
        Restaurant cinese = new Restaurant("La grande muraglia");

        Dish[] pizze = {
                new Dish("Margherita", 5, new String[] { "pomodoro", "mozzarella", "basilico" }),
                new Dish("Prosciutto e funghi", 7, new String[] { "pomodoro", "mozzarella", "prosciutto", "funghi" }),
                new Dish("Diavola", 6, new String[] { "pomodoro", "mozzarella", "salame piccante" }),
                new Dish("Capricciosa", 8,
                        new String[] { "pomodoro", "mozzarella", "funghi", "prosciutto", "olive", "carciofi" })
        };

        Drink[] bevandePizzeria = {
                new Drink("Coca-Cola", 2),
                new Drink("Fanta", 2),
                new Drink("Sprite", 2),
                new Drink("Acqua Naturale", 1)

        };

        pizzeria.setDishes(pizze);
        pizzeria.setDrinks(bevandePizzeria);

        Dish[] piattiCinese = {
                new Dish("Involtini Primavera", 3, new String[] { "Cavolo", "Carote", "Cipolla" }),
                new Dish("Gyoza", 4, new String[] { "Carne di maiale", "Cipolla", "Spezie" }),
                new Dish("Riso alla cantonese", 5, new String[] { "Prosciutto", "Piselli", "Uovo" })
        };

        Drink[] bevandeCinese = {
                new Drink("Birra Cinese", 5),
                new Drink("Fanta", 2),
                new Drink("Sprite", 2),
                new Drink("Acqua Naturale", 1)
        };

        cinese.setDishes(piattiCinese);
        cinese.setDrinks(bevandeCinese);

        System.out.println("Che fame! Seleziona un ristorante");
        System.out.println("1. Pizzeria Stella");
        System.out.println("2. La grande muraglia");
        System.out.println("3. Esci");

        Scanner scanner = new Scanner(System.in);

        String scelta = scanner.nextLine();

        switch (scelta) {
            case "1":
                pizzeria.infoMenu();
                break;
            case "2":
                cinese.infoMenu();
                break;
            case "3":
                System.out.println("Arrivederci!");
                break;
            default:
                System.out.println("Scelta non valida. Inserisci un numero tra quelli indicati.");
        }
    }
}
