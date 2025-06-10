public class Scientist extends Astronaut {

    private String spec;

    public Scientist(String name, int mission, String spec) {
        this.spec = spec;
        super(name, mission);
    }

    public String getSpec() {
        return spec;
    }

    public String getRole() {
        return "Scientist";
    }

}
