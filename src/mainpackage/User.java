package mainpackage;

public class User {
        String username;
        String name;
        String surname;
        int usersCounter = 0;
        String phone;

    public User(String username, String name, String surname, int usersCounter, String phone) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.usersCounter = usersCounter +1;
        this.phone = phone;
        //stoixeia epikoinwnias
    }

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

    public void login(){

    }

    public void logout(){

    }

}