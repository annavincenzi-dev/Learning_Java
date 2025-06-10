public class SchoolBook extends Book {
    /* ATTRIBUTO */
    String subject;
    int grade;

    /* getter e setter */
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /* COSTRUTTORE CON ATTRIVUTI DEL PADRE BOOK */
    public SchoolBook(String title, String author, int pages, int year, String subject, int grade) {
        super(title, author, pages, year);
        this.subject = subject;
        this.grade = grade;
    }

    /* OVERRIDE DEL MEDOTO TO STRING */
    /* Oltre agli attributi della superclasse aggiungo la materia e la classe */

    @Override
    public String toString() {
        return super.toString() + ", Materia: " + subject + ", Classe: " + grade;
    }
}
