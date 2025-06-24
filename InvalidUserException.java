public class InvalidUserException extends BankException{
    public InvalidUserException() {
        super("Username or password incorrect");
    }
}
