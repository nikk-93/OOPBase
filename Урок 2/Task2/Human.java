public class Human extends a_Actor {

    protected String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
