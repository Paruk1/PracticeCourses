package work12;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final long telephone;
    private final String occupation;
    private static int numberOfEmployees;


    {
        numberOfEmployees++; //для подсчета кол-ва объектов
    }


    public Employee(){
        firstName = "";
        lastName = "";
        occupation = "";
        telephone = 0;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        occupation = "";
        telephone = 0;
    }

    public Employee(String firstName, String lastName, long telephone, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public long getTelephone() {
        return telephone;
    }
    public String getOccupation() {
        return occupation;
    }
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }


}
