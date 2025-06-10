public class Book {
    /* ATTRIBUTI */
    String title;
    String author;
    int pages;
    int year;

    /* GETTER E SETTER (bau) */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /* COSTRUTTORE */
    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    /* OVERRIDE DEL METODO EQUALS */
    /** Due libri sono uguali se hanno autore e titolo uguale. */
    @Override
    public boolean equals(Object oth) {
        if (this == oth)
            return true;

        if (oth == null || this.getClass() != oth.getClass())
            return false;

        Book other = (Book) oth;
        if (this.title.equals(other.title) && this.author.equals(other.author))
            return true;
        else
            return false;
    }

    /* OVERRIDE DEL METODO TO STRING */
    @Override
    public String toString() {
        return "Titolo: " + title + ", Autore: " + author + ", Pagine: " + pages + ", Anno: " + year;
    }

}
