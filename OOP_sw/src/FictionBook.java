public class FictionBook extends Book {

    /* attributo */
    String genre;

    /* getter e setter */
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    /* COSTRUTTORE (CON ATTRIBUTI DEL PADRE BOOK) */
    public FictionBook(String title, String author, int pages, int year, String genre) {
        super(title, author, pages, year);
        this.genre = genre;
    }

    /* OVERRIDE DEL METODO TO STRING */
    /* oltre agli attributi della superclasse aggiungo il genere */
    public String toString() {
        return super.toString() + ", Genere: " + genre;
    }
}
