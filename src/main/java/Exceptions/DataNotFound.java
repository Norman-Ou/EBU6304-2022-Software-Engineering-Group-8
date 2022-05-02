package Exceptions;

/**
 * Exception when there is no such passenger
 *
 * @author Jiacheng Li
 * @version 0.1
 */
public class DataNotFound extends Exception{
    private String inputInfo; 
    public DataNotFound(String inputInfo){
        this.inputInfo = inputInfo;
    }

    public String getInputInfo() {
        return this.inputInfo;
    }
}
