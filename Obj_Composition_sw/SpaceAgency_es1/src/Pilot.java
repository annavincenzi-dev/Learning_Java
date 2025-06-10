public class Pilot extends Astronaut {
    private String hierarchy;

    public Pilot(String name, int mission, String hierarchy) {
        this.hierarchy = hierarchy;
        super(name, mission);
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public String getRole() {
        return "Pilot";
    }

}
