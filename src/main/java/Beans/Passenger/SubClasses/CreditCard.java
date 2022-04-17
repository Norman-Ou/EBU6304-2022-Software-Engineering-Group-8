package Beans.Passenger.SubClasses;


/**
 * This is the basic Passenger information class
 *
 * @author Jiacheng Li
 * @version 0.2 March 24th, 2022
 */
public class CreditCard {
    /**
     * Number of the credit card.<br/><br/>
     * Default Value: null
     */
    private String cardNo;
    /**
     * Owner's name on the credit card.<br/><br/>
     * Default Value: null
     */
    private String nameOnCard;
    /**
     * Belonging country of the credit card.<br/><br/>
     * Default Value: null
     */
    private String country;
    /**
     * Expiration date of the credit card.<br/><br/>
     * Default Value: null
     */
    private String expirationDate;
    /**
     * CVC security code of the credit card.<br/><br/>
     * Default Value: null
     */
    private String cvcCode;
    /**
     * Postal code of the credit card.<br/><br/>
     * Default Value: null
     */
    private String postalCode;
    /**
     * Billing address.<br/><br/>
     * Default Value: null
     */
    private String billAddress;

    /**
     * Default constructor
     */
    public CreditCard(){}

    public CreditCard(String cardNo) {
        this.cardNo = cardNo;
    }

    public CreditCard(String cardNo,
                      String nameOnCard,
                      String country,
                      String expirationDate,
                      String cvcCode,
                      String postalCode,
                      String billAddress)
    {
        this.cardNo = cardNo;
        this.nameOnCard = nameOnCard;
        this.country = country;
        this.expirationDate = expirationDate;
        this.cvcCode = cvcCode;
        this.postalCode = postalCode;
        this.billAddress = billAddress;
    }

    /**
     * Accessors of CreditCard class
     */
    public String getCardNo(){return cardNo;}
    public String getNameOnCard(){return nameOnCard;}
    public String getCountry(){return country;}
    public String getExpirationDate(){return expirationDate;}
    public String getCvcCode(){return cvcCode;}
    public String getPostalCode(){return postalCode;}
    public String getBillAddress(){return billAddress;}

    /**
     * Modifiers of CreditCard Class
     */
    public void setCardNo(String cardNo){this.cardNo = cardNo;}
    public void setNameOnCard(String nameOnCard){this.nameOnCard = nameOnCard;}
    public void setCountry(String country){this.country = country;}
    public void setExpirationDate(String expirationDate){this.expirationDate = expirationDate;}
    public void setCvcCode(String cvcCode){this.cvcCode = cvcCode;}
    public void setPostalCode(String postalCode){this.postalCode = postalCode;}
    public void setBillAddress(String billAddress){this.billAddress = billAddress;}
}
