package mainpackage;

public class CreateUsers {

    public static void main(String[] args) {
        int counter = 0;
        User user = new User("anampel" , "Anastasia", "Mpelia", counter, "6978032788");
        User user1 = new User("mpilo" , "Mpampis", "Loukas", user.getUsersCounter(), "6935261768");
        User user2 = new User("marika" , "Maria", "Rikaki", user1.getUsersCounter(), "6987654324");
        user.login();
        user.logout();
        System.out.println();
        Patient patient = new Patient("maka" , "Manwlis", "Kalidis", counter, "1727362789", "public", "private");
        Patient patient1 = new Patient("mpilo" , "Mpampis", "Loukas", user.getUsersCounter(), "698765432123", "1725662789", "public");
        Patient patient2 = new Patient("marika" , "Maria", "Rikaki", user1.getUsersCounter(), "69876543216", "", "public");
    }
}
