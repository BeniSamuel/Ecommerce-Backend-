
package controllers;
import java.util.Scanner;


public class RegistrationController {
    public void handleLogin ( ) {
        // Scanner Configuration
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Enter Your Information for Login-------");
        
        // Input Field
        System.out.println(" Enter Email: ");
        String email = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();


        // submit login
        var submitLogin = new UserController();
        submitLogin.logUser(email, password);

        sc.close();
    } 
    
    public void handleSignin () {
        // Scanner Configuration
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Enter Your Information for signin-------");

        // Input Field
        System.out.println(" Enter Name: ");
        String name = sc.next();
        System.out.println(" Enter Email: ");
        String email = sc.next();
        System.out.println(" Enter Password");
        String password = sc.next(); 
        
        // submit signin
        var submitSignin = new UserController();
        submitSignin.createUser(name, email, password);

        sc.close();
    }
}
