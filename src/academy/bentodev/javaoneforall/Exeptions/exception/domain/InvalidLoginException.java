package academy.bentodev.javaoneforall.Exeptions.exception.domain;

public class InvalidLoginException extends Exception{
     public InvalidLoginException(){
         super("Login invalido");
     }
     public InvalidLoginException(String message){
         super(message);
     }
}
