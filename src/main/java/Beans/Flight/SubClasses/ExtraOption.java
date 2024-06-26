package Beans.Flight.SubClasses;

import java.io.Serializable;

/**
 * This is abstraction for an extra option
 *
 * @author Jiacheng Li
 * @version 1.0 May 2nd, 2022
 */
public class ExtraOption  implements Serializable {
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
     * Default constructor with no parameters.<br/>
     */
    public ExtraOption(){}

    public ExtraOption(int kind,
                       String description,
                       int price)
    {
        this.kind = kind;
        this.description = description;
        this.price = price;
    }

    /**
     * Accessors of ExtraOption
     */
    public int getKind() {return kind;}
    public String getDescription() {return description;}
    public int getPrice() {return price;}

    /**
     * Modifiers of ExtraOption
     */
    public void setKind(int kind) {this.kind = kind;}
    public void setDescription(String description) {this.description = description;}
    public void setPrice(int price) {this.price = price;}
}
