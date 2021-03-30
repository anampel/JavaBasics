package mainpackage;
/**
 *Child of User, concerns Admins
 * */
public class Admin extends User{
    public String id;

    /**
     *Constructor
     * */
    public Admin(String username, String name, String surname, int usersCounter, String phone, String id) {
        super(username, name, surname, usersCounter, phone);
        this.id = id;
    }
    /**
     *Getters & Setters
     * */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /**
     *Insert a new doctor to the application
     * @param username The username of the doctor
     * @param name The name of the doctor
     * @param surname The surname of the doctor
     * @param phone The phone of the doctor
     * @param specialty The specialty of the doctor
     * */
    public void insert_new_doctor(String username, String name, String surname, String phone,  String specialty){

    }

    /**
     *Delete doctors
     * @param username The username of the doctor
     * */
    public void delete_doctor(String username){

    }
    /**
     *Update the values of the doctor
     * @param username The new or existing username of the doctor
     * @param name The new or existing name of the doctor
     * @param surname The new or existing surname of the doctor
     * @param phone The new or existing phone of the doctor
     * @param specialty The new or existing specialty of the doctor
     * */
    public void update_doctor(String username, String name, String surname, String phone,  String specialty){

    }
    /**
     *Update the values of a patient
     * @param username  The username of the patient
     * @param name The name of the patient
     * @param surname The surname of the patient
     * @param phone The phone of the patient
     * @param amka The amka of the patient
     * @param asfaleia The asfaleia of the patient
     * */
    public void update_patient(String username, String name, String surname, String phone, String amka, String asfaleia){

    }

}
