package mainpackage;

public class Doctor extends User{
    public String specialty;


    public Doctor(String username, String name, String surname, int usersCounter, String phone,  String specialty) {
        super(username, name, surname, usersCounter, phone);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //provoli programmatos rantevou: plano

    //diathesimes meres gia rantevou
}
