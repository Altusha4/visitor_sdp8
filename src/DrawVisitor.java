public class DrawVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Draw Circle");
    }
    @Override
    public void visit(Square square) {
        System.out.println("Draw Square");
    }
}
