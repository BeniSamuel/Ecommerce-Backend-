import java.util.Scanner;
import controllers.*;
public class Main {
    public static void main (String[] args){
        // Configuring Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n----------- Welcome to SE-ECOMMERCE 👌---------------");

        // Instruction For Using The System
        System.out.println("To start using se-ecommerce you need to register first 👍");
        System.out.println(" Do you have an account: 1/0");
        
        System.out.println("> ");
        byte choice = sc.nextByte();

        // Registration process begins here 😁
        var register = new RegistrationController();

        if ( choice == 1) {
            register.handleLogin();
        }else {
            register.handleSignin();
        }
            
        sc.close();
    }
}
