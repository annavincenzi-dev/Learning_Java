public class StaffMember extends Person {
    private int crew;

    public StaffMember(String name, int crew) {
        super(name);
        this.crew = crew;
    }

    public int getCrew() {
        return crew;
    }

    public String getRole() {
        return "Crew Member";
    }
}
