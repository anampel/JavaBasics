package mainpackage;
/**
 *
 * */
public class CreateUsers {

    public static void main(String[] args) {
        User user = new User("anampel" , "Anastasia", "Mpelia", "6978032788");
        User user1 = new User("mpilo" , "Mpampis", "Loukas",  "6935261768");
        User user2 = new User("marika" , "Maria", "Rikaki", "6987654324");
        user.login("anampel", "6978032788");
        user.logout();
        System.out.println();
        Patient patient = new Patient("maka" , "Manwlis", "Kalidis", "1727362789", "public", "private");
        Patient patient1 = new Patient("mpilo" , "Mpampis", "Loukas", "698765432123", "1725662789", "public");
        Patient patient2 = new Patient("marika" , "Maria", "Rikaki", "69876543216", "", "public");
    }
}
