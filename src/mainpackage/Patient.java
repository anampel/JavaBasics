package mainpackage;

/**
 *Child of User, concerns patients
 * */
public class Patient extends User{
    public String amka;
    public String asfaleia; // (idiotikh/dhmosia)
    /**
     *Constructor
     * */
    public Patient(String username, String name, String surname, String phone, String amka, String asfaleia) {
        super(username, name, surname, phone);
        this.asfaleia = asfaleia;
        this.registration(username, name, surname, phone, amka, asfaleia);
    }
    /**
     *Getters & Setters
     * */
    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public String getAsfaleia() {
        return asfaleia;
    }

    public void setAsfaleia(String asfaleia) {
        this.asfaleia = asfaleia;
    }
    /**
     *Register a user as patient
     * @param username  The username of the patient
     * @param name The name of the patient
     * @param surname The surname of the patient
     * @param phone The phone of the patient
     * @param amka The amka of the patient
     * @param asfaleia The asfaleia of the patient
     * */
    public void registration(String username, String name, String surname, String phone, String amka, String asfaleia){
        System.out.println("Registration completed successfully for the patient " + username);
    }
    /**
     *Searches appointment per doctor name
     * @param name  The name of the doctor
     * @param surnname The surname of the doctor
     * */
    public void searchAppointmentPerDoctor(String name, String surnname){

    }
    /**
     *Searches appointment per doctor's specialty
     * @param specialty  The name of the doctor
     * */
    public void searchAppointmentPerSpecialty(String specialty){

    }

    /**
     *Searches patient's appointments
     * @param username The username of the patient
     * @param amka  The amka of the patient
     * */
    public void searchMyAppointment(String username,String amka){

    }

    /**
     *Searches patient's appointments history
     * @param username The username of the patient
     * @param amka  The amka of the patient
     * */
    public void searchAppointmentHistory(String username,String amka){

    }
}
