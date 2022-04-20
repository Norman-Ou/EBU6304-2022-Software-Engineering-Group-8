package Exceptions;

/**
 * Exception when there is no such passenger
 *
 * @author Jiacheng Li
 * @version 0.1
 */
public class PassengerDoesNotExistException extends Exception{
    private String inputInfo;
    public PassengerDoesNotExistException(String inputInfo){
        this.inputInfo = inputInfo;
    }

    public String getInputInfo() {
        return this.inputInfo;
    }
}
