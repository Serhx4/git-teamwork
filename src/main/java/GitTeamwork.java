public class GitTeamwork {

    public static void main(String[] args) {
        System.out.println("""
        
        Hi there! Welcome to the team!
        We already have 6 teammates :D
        ------------------------------
        """);
	    simulateTeamwork("THIS IS PRE LAST COMMIT");
        simulateTeamwork("Serhx4");
        simulateTeamwork("Hello dudes");
        simulateTeamwork("divizia");
        simulateTeamwork("Serhx4 again:)");
        simulateTeamwork("Serhx4 and again:)");
        simulateTeamwork("Ahahahah. It's a conflict!");
        simulateTeamwork("We are four members");
        simulateTeamwork("And again a conflict!");
        simulateTeamwork("hello");
    }

    private static void simulateTeamwork(String name) {
        System.out.format("%s simulates teamwork :)\n", name);
    }
}
