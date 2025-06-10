public class App {
    public static void main(String[] args) throws Exception {
        Pilot pilot1 = new Pilot("John", 789, "Chief Pilot");
        Pilot pilot2 = new Pilot("Jane", 789, "Co-Pilot");
        Scientist scientist1 = new Scientist("Bob", 456, "Astrophysicist");
        Scientist scientist2 = new Scientist("Alice", 789, "Biologist");

        StaffMember staff1 = new StaffMember("David", 789);
        StaffMember staff2 = new StaffMember("Rachel", 789);

        System.out.println("Pilot 1 name: " + pilot1.getName() + ", Role: " + pilot1.getRole() + ", Mission: "
                + pilot1.getMission() + ", Hierarchy: " + pilot1.getHierarchy());
        System.out.println("Pilot 2 name: " + pilot2.getName() + ", Role: " + pilot2.getRole() + ", Mission: "
                + pilot2.getMission() + ", Hierarchy: " + pilot2.getHierarchy());
        System.out
                .println("Scientist 1 name: " + scientist1.getName() + ", Role: " + scientist1.getRole() + ", Mission: "
                        + scientist1.getMission() + ", Specialization: " + scientist1.getSpec());
        System.out
                .println("Scientist 2 name: " + scientist2.getName() + ", Role: " + scientist2.getRole() + ", Mission: "
                        + scientist2.getMission() + ", Specialization: " + scientist2.getSpec());
        System.out.println("Staff Member 1 name: " + staff1.getName() + ", Role: " + staff1.getRole() + ", Crew: "
                + staff1.getCrew());
        System.out.println("Staff Member 2 name: " + staff2.getName() + ", Role: " + staff2.getRole() + ", Crew: "
                + staff2.getCrew());
    }
}
