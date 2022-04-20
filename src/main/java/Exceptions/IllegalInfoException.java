package Exceptions;

/**
 * Exception when the input info is illegal
 *
 * @author Jiacheng Li
 * @version 0.1
 */
public class IllegalInfoException extends Exception {
    private String inputData;

    public IllegalInfoException(String inputData){
        this.inputData = inputData;
    }

    public String getInputData() {
        return inputData;
    }
}
