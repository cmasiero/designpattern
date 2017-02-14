package Behavioral.ChainOfResponsibility;

/**
 * Created by cristiano on 06/02/17.
 */
public class Currency {

    private int amount;

    public Currency(int amt){
        this.amount=amt;
    }

    public int getAmount(){
        return this.amount;
    }
}
