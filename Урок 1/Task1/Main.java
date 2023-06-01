public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Барсик");
        cat.setAge(3);

        Owner owner = new Owner();
        owner.setName("Иван");

        cat.setOwnerName(owner.getName());

        cat.greet();
    }
}