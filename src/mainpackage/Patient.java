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
    public Patient(String username, String name, String surname, int usersCounter, String phone, String amka, String asfaleia) {
        super(username, name, surname, usersCounter, phone);
        this.asfaleia = asfaleia;
        //tha mpei try-catch
        if (usersCounter<1 && amka != "" && amka != null){
            this.amka = amka;
            System.out.println(this.amka);
        }else{
            if (usersCounter >= 1 && amka != "" && amka != null) {System.out.println("There is already an amka. You cannot change the existing.\"");}
            if (amka == "" || amka == null){System.out.println("Your enter is empty ");}
        }
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
