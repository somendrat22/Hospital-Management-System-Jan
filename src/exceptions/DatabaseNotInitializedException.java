package exceptions;

public class DatabaseNotInitializedException extends Exception{
    public DatabaseNotInitializedException(String mssg){
        super(mssg);
    }
}
