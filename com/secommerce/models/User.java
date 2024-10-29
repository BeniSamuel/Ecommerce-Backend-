package models;
import java.util.ArrayList;

public class User {
    public String name;
    public String email;
    public String password;
    public static ArrayList<User> users = new ArrayList<User>();

    public User ( String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        users.add(this);
    }

   
}
