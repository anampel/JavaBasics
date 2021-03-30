package mainpackage;
/**
 *Child of User, concerns Doctors
 * */
public class Doctor extends User{
    public String specialty;

    /**
     *Constructor
     * */
    public Doctor(String username, String name, String surname, int usersCounter, String phone,  String specialty) {
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
    public void show_plan(String username){

    }
    /**
     *Entry doctor availability for appointments per month
     * @param username The username of the doctor
     * @param name The name of the doctor
     * @param surname The surname of the doctor
     * */
    public void available_days(String username, String name, String surname){

    }
}
