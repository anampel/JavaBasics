package mainpackage;

import java.text.*;
import java.time.LocalDate;
import java.util.Date;

/**
 *Child of User, concerns Doctors
 * */
public class Doctor extends User{
    public String specialty;

    /**
     *Constructor
     * */
    public Doctor(String username, String name, String surname, String phone,  String specialty) {
        super(username, name, surname, phone);
    }
    /**
     *Getters & Setters
     * */
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    /**
     *Return the plan of the appointments
     * @param username The username of the doctor
     * */
    public void showPlan(String username){

    }
    /**
     *Entry doctor availability for appointments per month
     * @param username The username of the doctor
     * @param name The name of the doctor
     * @param surname The surname of the doctor
     * */
    public void availableDays(String username, String name, String surname) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date1 = dateFormat.format(new Date());
        System.out.println("The available day for the doctor " + name + " "+ surname + " is " + date1);
    }
}
