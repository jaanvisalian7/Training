package excep;
class InvalidAgeException extends Exception{
InvalidAgeException(String msg){
    super(msg);
}
}
public class Main1 {
static void checkAge(int age) throws InvalidAgeException{
    if(age<18) {
        throw new InvalidAgeException(("Invalid age,it has to be greater than 18"));
    }
    else {
        System.out.println("vaild age");
    }
}
public static void main(String[] args){
    try{
        checkAge(20);
    } catch (InvalidAgeException e)
    {
        System.out.println(e.getMessage());
    }finally {
        System.out.println("end for program");
    }
}
}