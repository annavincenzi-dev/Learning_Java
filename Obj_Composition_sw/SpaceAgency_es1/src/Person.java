abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    abstract public String getRole();

    public String getName() {
        return name;
    }
}
