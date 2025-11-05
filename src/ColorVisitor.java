public class ColorVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Paint Circle");
    }
    @Override
    public void visit(Square square) {
        System.out.println("Paint Square");
    }
}
