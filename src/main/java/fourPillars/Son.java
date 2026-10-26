package fourPillars;

public class Son extends Father {

    private String name;

    public Son(String fathersName, String name) {
        super(fathersName);
        this.name = name;
        System.out.println("I am : " + name);
    }
}
