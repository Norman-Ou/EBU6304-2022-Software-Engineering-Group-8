package Flight;

import Passenger.CreditCard;

/**
 * This is the basic Passenger information class
 *
 * @author Jiacheng Li
 * @version 0.2 March 24th, 2022
 */
public class ExtraOption {
    /**
     * Kind of a certain extra option.<br/><br/>
     * Kind No: <br/>
     * <b>0</b> means <b>Seating options</b><br/>
     * <b>1</b> means <b>Meal options</b><br/><br/>
     *
     * Default Value: <b>-1</b>
     */
    private int kind = -1;
    /**
     * Description of the option.<br/><br/>
     * Default Value: <b>"default"<b/>
     */
    private String description = "default";
    /**
     * Price of the option.<br/><br/>
     * Default Value: <b>-1<b/>
     */
    private int price = -1;
    /**
     * id number of the ordering passenger.<br/><br/>
     * Default Value: <b>-1</b>
     */
    private String passengerId;
    /**
     * Binding credit card payment object of the passenger.<br/><br/>
     * Default Value: <b>new CreditCard()</b>
     */
    private CreditCard payment;

    /**
     * Default constructor with no parameters.<br/>
     */
    public ExtraOption(){}

    public ExtraOption(int kind,
                       String description,
                       int price,
                       String passengerId,
                       CreditCard payment)
    {
        this.kind = kind;
        this.description = description;
        this.price = price;
        this.passengerId = passengerId;
        this.payment = payment;
    }

    /**
     * Accessors of ExtraOption
     */
    public int getKind() {return kind;}
    public String getDescription() {return description;}
    public int getPrice() {return price;}
    public String getPassengerId() {return passengerId;}
    public CreditCard getPayment() {return payment;}

    /**
     * Modifiers of ExtraOption
     */
    public void setKind(int kind) {this.kind = kind;}
    public void setDescription(String description) {this.description = description;}
    public void setPrice(int price) {this.price = price;}
    public void setPassengerId(String passengerId) {this.passengerId = passengerId;}
    public void setPayment(CreditCard payment) {this.payment = payment;}
}
