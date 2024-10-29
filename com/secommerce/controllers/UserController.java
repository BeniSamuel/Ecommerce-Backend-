package controllers;
import models.User;
import java.util.Iterator;

public class UserController {

    // Creating a User
    public void createUser(String name, String email, String password) {
        // Check if the user already exists
        for (User user : User.users) {
            if (user.email.equals(email)) {  // Use .equals for string comparison
                System.out.println("User Already Exists in the System");
                return; // Exit method if user exists
            }
        }
        
        // If no match found, create a new user
        var newUser = new User(name, email, password);
        User.users.add(newUser); // Add new user to the list
        System.out.println("User Created Successfully: Name: " + newUser.name + ", Email: " + newUser.email);
    }

    // Logging in a User
    public void logUser(String email, String password) {
        for (User user : User.users) {
            if (user.email.equals(email) && user.password.equals(password)) {
                System.out.println("------- Welcome to System, " + user.name + " -------");
                return;
            }
        }
        System.out.println("Incorrect Email or Password");
    }

    // Deleting a User
    public void logOutUser(String email) {
        Iterator<User> iterator = User.users.iterator(); // Use iterator for safe removal
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.email.equals(email)) {
                iterator.remove();  // Remove user if email matches
                System.out.println("User " + email + " has been removed.");
                return;
            }
        }
        System.out.println("User doesn't exist.");
    }
}
