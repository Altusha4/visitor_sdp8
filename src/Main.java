public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        Visitor drawer = new DrawVisitor();

        circle.accept(drawer);
        square.accept(drawer);
    }
}
