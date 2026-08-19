package exception;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
public class Sample {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("invalidage.it has to be greater than 18");
        } else {
            System.out.println("valid age");
        }
    }

    public static void main(String[] args){
        try{
            checkAge(20);

        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("end of the program");
        }
    }
}