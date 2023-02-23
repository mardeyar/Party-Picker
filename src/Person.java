public class Person {

    // Properties for a person in this program
    private String firstName;
    private String lastName;
    private boolean isInvited;

    // Default constructor
    public Person() {

    }

    public Person(String firstName, String lastName, boolean isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    // Getter for the isInvited boolean
    public boolean isInvited() {
        return isInvited;
    }

    // Methods for the person class
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
