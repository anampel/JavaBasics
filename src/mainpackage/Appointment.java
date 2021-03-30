package mainpackage;

import java.util.Date;
/**
*Create an Appointment, including characteristics from classes Patient and Doctor
* */
public class Appointment extends Patient {
    Date date = new Date();
    String kind_of_examination;
    String participation;
    /**
     *Constructor
     * */
    public Appointment(String username, String name, String surname, int usersCounter, String phone, String amka, String asfaleia) {
        super(username, name, surname, usersCounter, phone, amka, asfaleia);
    }
    /**
     *Just as Java doesn't support multiple inheritance, we created a private inner class that extends a second class Doctor.
     * */
    private class Appointment1 extends Doctor{
        /**
         *Constructor
         * */
        public Appointment1(String username, String name, String surname, int usersCounter, String phone, String specialty) {
            super(username, name, surname, usersCounter, phone, specialty);
        }
    }
    /**
     *Getters & Setters
     * */
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
     * @param date The date of the appointment
     * @param username The username of the patient
     * @param name The name of the patient
     * @param surname The surname of the patient
     * @param phone The phone of the patient
     * @param amka The amka of the patient
     * @param examination The kind_of_examination
     * */
    private void create_appointment(String date, String username, String name, String surname, String phone, String amka, String examination){

    }
}


