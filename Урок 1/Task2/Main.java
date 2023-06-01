public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(10);
        rectangle.setWidth(15);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

    }
}
