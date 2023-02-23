public class Friend extends Person {

    // Property for a friend, they bring food
    private String foodToBring;

    // Default constructor
    public Friend() {

    }

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    // Methods for the friend
    @Override
    public String toString() {
        if (isInvited() == true) {
            return super.getFullName() + " is bringing " + foodToBring + ". INVITED.";
        } else {
            return super.getFullName() + " is bringing " + foodToBring + ". NOT INVITED.";
        }
    }
}
