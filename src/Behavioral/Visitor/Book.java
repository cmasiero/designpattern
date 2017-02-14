package Behavioral.Visitor;

/**
 * Created by cristiano on 09/02/17.
 */
public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn){
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    /**
     * Notice the implementation of accept() method in concrete classes, its calling visit()
     * method of Visitor and passing itself as argument.
     * @param visitor
     * @return
     */
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}