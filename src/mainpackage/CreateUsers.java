package mainpackage;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *Class CreateUsers include main method that create objects from the other classes, call them and print the results.
 * */
public class CreateUsers {

    public static void main(String[] args) throws FileNotFoundException {

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
//        Patient patient = new Patient("marika" , "Maria", "Rikaki", "69876543216", "", "public");
        try {
            File myObj = new File("src/data/patient.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] vars = data.split(" ");
                Patient pat = new Patient(vars[0], vars[1], vars[2], vars[3], vars[4], vars[5]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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
