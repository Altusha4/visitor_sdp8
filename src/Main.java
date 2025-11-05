public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        Visitor drawer = new DrawVisitor();
        Visitor painter = new ColorVisitor();

        circle.accept(drawer);
        square.accept(drawer);
        circle.accept(painter);
        square.accept(drawer);
    }
}
