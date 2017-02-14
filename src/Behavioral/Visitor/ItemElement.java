package Behavioral.Visitor;

/**
 * Created by cristiano on 09/02/17.
 */
public interface ItemElement {
    /**
     * Notice that accept method takes Visitor argument.
     * We can have some other methods also specific for items but
     * for simplicity I am not going into that much detail
     * and focusing on visitor pattern only.
     * @param visitor
     * @return
     */
    public int accept(ShoppingCartVisitor visitor);
}