import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        FictionBook lotr = new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1178, 1954, "Fantasy");
        FictionBook IR = new FictionBook("I Robot", "Isaac Asimov", 224, 1950, "Science Fiction");

        SchoolBook math = new SchoolBook("Linear Algebra", "Prof. Smith", 300, 2019, "Mathematics", 10);

        SchoolBook eng = new SchoolBook("English", "Prof. Jones", 400, 2019, "English", 10);
        SchoolBook eng2 = new SchoolBook("English", "Prof. Jones", 410, 2021, "English Language", 10);

        /* prova override equals */
        System.out.println("metodo equals pre-setting"); // TRUE
        System.out.println(lotr.equals(IR)); // FALSE
        System.out.println(math.equals(eng)); // FALSE
        System.out.println(eng.equals(eng2)); // TRUE

        /* prova metodi getter */
        System.out.println("Titoli di narrativa disponibili:");
        System.out.println(lotr.getTitle());
        System.out.println(IR.getTitle());

        /* prova metodi setter */
        eng2.setTitle("Literature");

        /* equals post setter */
        System.out.println("metodo equals post-setting");
        System.out.println(eng.equals(eng2)); // FALSE

        /* test override di toString() */
        /*
         * System.out.println(lotr.toString());
         * System.out.println(IR.toString());
         * System.out.println(math.toString());
         * System.out.println(eng.toString());
         */

        /* creo array list di tutti i libri */
        ArrayList<Book> library = new ArrayList<>();
        library.add(lotr);
        library.add(IR);
        library.add(math);
        library.add(eng);
        library.add(eng2);

        /* stampo tutti i libri */
        for (Book b : library) {
            System.out.println(b);
        }

        /* test funzione booksByAuthor() */
        booksByAuthor(library, "Prof. Jones");
    }

    /* funzione per mostrare tutti i libri di un autore */
    public static void booksByAuthor(ArrayList<Book> library, String author) {
        System.out.println("Libri scritti da " + author + ":");
        /* stampa tutti i libri presenti nell'array con l'autore specificato */
        for (Book b : library) {
            if (b.getAuthor().equals(author))
                System.out.println(b);
        }
    }

}
