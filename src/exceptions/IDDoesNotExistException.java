package exceptions;

public class IDDoesNotExistException extends RuntimeException{
    // If doctorId or patientId does not exist in the database at that moment we will throw this kind of exception

    public IDDoesNotExistException(String message){
        super(message);
    }

}
