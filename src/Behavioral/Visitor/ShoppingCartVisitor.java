package Behavioral.Visitor;

/**
 * Created by cristiano on 09/02/17.
 */
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
