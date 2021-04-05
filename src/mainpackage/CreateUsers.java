package mainpackage;
/**
 *Class CreateUsers include main method that create objects from the other classes, call them and print the results.
 * */
public class CreateUsers {

    public static void main(String[] args) {

        /**
         * Create object for the class User
         **/
        User user = new User("anampel" , "Anastasia", "Mpelia", "6978032788");
        User user1 = new User("mpilo" , "Mpampis", "Loukas",  "6935261768");
        User user2 = new User("marika" , "Maria", "Rikaki", "6987654324");
        user.login("anampel", "6978032788");
        user.logout();
        System.out.println();
        /**
         * Create object for the class Patient
         **/
        Patient patient = new Patient("maka" , "Manwlis", "Kalidis", "698723456787", "1234567890", "private");
        Patient patient1 = new Patient("mpilo" , "Mpampis", "Loukas", "698765432123", "1725662789", "public");
        Patient patient2 = new Patient("marika" , "Maria", "Rikaki", "69876543216", "", "public");
        /**
         * Create object for the class Doctor
         **/
        Doctor doctor = new Doctor("fakas", "Fanourios", "Karagewrgiou", "698765432156", "pathologist");
        doctor.availableDays("fakas","Fanourios", "Karagewrgiou");
        /**
         * Create object for the class Admin
         **/
        Admin admin = new Admin("anampel" , "Anastasia", "Mpelia", "6978032788", "7535");
        admin.updatePatient("maka" , "Manwlis", "Kalidis", "698723456787", "1234567980", "public");
        /**
         * Create object for the class Appointment
         **/
        Appointment appointment = new Appointment("marika" , "Maria", "Rikaki", "69876543216", "", "public");
        appointment.createAppointment();
    }
}
