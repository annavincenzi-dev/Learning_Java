abstract class Astronaut extends Person {

    private int mission;

    public Astronaut(String name, int mission) {
        super(name);
        this.mission = mission;
    }

    public int getMission() {
        return mission;
    }

    abstract public String getRole();
}
