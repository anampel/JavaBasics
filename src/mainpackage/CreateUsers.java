package mainpackage;

public class CreateUsers {

    public static void main(String[] args) {
        int counter = 0;
        User user = new User("anampel" , "Anastasia", "Mpelia", counter);
        User user1 = new User("mpilo" , "Mpampis", "Loukas", user.getUsersCounter());
        User user2 = new User("marika" , "Maria", "Rikaki", user1.getUsersCounter());
        user.login();
        user.logout();
        System.out.println();
        Patient patient = new Patient("maka" , "Manwlis", "Kalidis", counter, "1727362789", "public");
        Patient patient1 = new Patient("mpilo" , "Mpampis", "Loukas", user.getUsersCounter(), "1725662789", "private");
        Patient patient2 = new Patient("marika" , "Maria", "Rikaki", user1.getUsersCounter(), "", "public");
    }
}
