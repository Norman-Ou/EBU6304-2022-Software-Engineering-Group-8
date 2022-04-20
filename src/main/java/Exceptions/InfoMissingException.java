package Exceptions;

/**
 * Exception when the information is incomplete
 *
 * @author Jiacheng Li
 * @version 0.1
 */
public class InfoMissingException extends Exception{
    private String infoName;

    public InfoMissingException(String infoName){
        this.infoName = infoName;
    }

    public String getInfoName(){
        return this.infoName;
    }
}
