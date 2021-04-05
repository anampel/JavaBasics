package mainpackage;

import java.util.Date;
import java.util.Scanner;

/**
*Create an Appointment, including characteristics from classes Patient and Doctor
* */
public class Appointment extends Patient {
    String date ;
    String kind_of_examination;
    String participation;
    /**
     *Constructor
     * */
    public Appointment(String username, String name, String surname, String phone, String amka, String asfaleia) {
        super(username, name, surname, phone, amka, asfaleia);
    }
    /**
     *Just as Java doesn't support multiple inheritance, we created a private inner class that extends a second class Doctor.
     * */
    private class Appointment1 extends Doctor{
        /**
         *Constructor
         * */
        public Appointment1(String username, String name, String surname, String phone, String specialty) {
            super(username, name, surname, phone, specialty);
        }
    }
    /**
     *Getters & Setters
     *
     * @return*/
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKind_of_examination() {
        return kind_of_examination;
    }

    public void setKind_of_examination(String kind_of_examination) {
        this.kind_of_examination = kind_of_examination;
    }

    public String getParticipation() {
         return participation;
    }

    public void setParticipation(String participation) {
        this.participation = participation;

    }
    /**
     *Create an appointment
     * */
    public void createAppointment(){
        Scanner console = new Scanner(System.in);
        System.out.println("To create an appointment please insert the following: " +
                "Date: \n" +
                "Kind of examination: \n");
        date = console.next();
        kind_of_examination = console.next();
        if (kind_of_examination == "General"){
            setParticipation("25");
        }
        System.out.println("Your appointment for the username " + username + " is in date " + date + " for the examination " + kind_of_examination + " with participation " + getParticipation());
    }
}


