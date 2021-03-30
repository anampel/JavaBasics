package mainpackage;
/**
 *Initialize the user's values and reproduce them to its children
 * */
public class User {
        String username;
        String name;
        String surname;
        int usersCounter = 0;
        String phone;
    /**
     *Constructor
     * */
    public User(String username, String name, String surname, String phone) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.usersCounter = usersCounter +1;
        this.phone = phone;
        usersCounter +=1 ;
    }
    /**
     *Getters & Setters
     * */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getUsersCounter() {
        return usersCounter;
    }

    public void setUsersCounter(int usersCounter) {
        this.usersCounter = usersCounter;
    }
    /**
     *Users login
     * @param username The username of the user
     * @param phone The phone of the user
     * */
    public void login(String username, String phone){

    }
    /**
     *Users logout
     * No parameters
     * */
    public void logout(){

    }

}