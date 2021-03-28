package mainpackage;

public class Patient extends User{
    public String amka;
    public String asfaleia; // (idiotikh/dhmosia)

    public Patient(String username, String name, String surname, int usersCounter, String phone, String amka, String asfaleia) {
        super(username, name, surname, usersCounter, phone);
        this.asfaleia = asfaleia;
        if (usersCounter<1 && amka != "" && amka != null){
            this.amka = amka;
            System.out.println(this.amka);
        }else{
            if (usersCounter >= 1 && amka != "" && amka != null) {System.out.println("There is already an amka. You cannot change the existing.\"");}
            if (amka == "" || amka == null){System.out.println("Your enter is empty ");}
        }
    }

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

    public void registration(){

    }

    public void searchAppointmentPerDoctor(){

    }

    public void searchAppointmentPerSpecialty(){

    }
    public void searchMyAppointment(){

    }
    public void searchAppointmentHistory(){

    }
}
