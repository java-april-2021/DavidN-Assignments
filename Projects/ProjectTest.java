public class ProjectTest{
    public static void main(String[] args){
        Project blank = new Project();
        blank.setName("Alpha");
        blank.setDescription("First project");
        System.out.println(blank.elevatorPitch());
        Project named = new Project("Beta");
        named.setDescription("Second Project");
        System.out.println(named.elevatorPitch());
        Project full = new Project("Omega", "Final Project");
        System.out.println(full.elevatorPitch());
    }
}