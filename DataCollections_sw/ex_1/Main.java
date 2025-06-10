
import model.Person;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person anna = new Person("Anna", 24);
        Person silvia = new Person("Silvia", 62);
        Person nicola = new Person("Nicola", 65);
        Person ivan = new Person("Ivan", 43);
        Person rebecca = new Person("Rebecca", 52);
        Person lucia = new Person("Lucia", 14);

        List<Person> persone = new ArrayList<>();
        persone.add(anna);
        persone.add(silvia);
        persone.add(nicola);
        persone.add(ivan);
        persone.add(rebecca);
        persone.add(lucia);

        List<Person> over50 = new ArrayList<>();

        for (Person person : persone) {
            person.info();

            if (person.getAge() > 50) {
                over50.add(person);
            }
        }

        System.out.println("Over 50: " + over50);

    }
}
