import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // We need an arraylist to hold all Friend objects entered by user
        ArrayList<Friend> friendList = new ArrayList<>();

        // Pop-up to display a welcome message with instructions
        JOptionPane.showMessageDialog(null, "Welcome to Party Picker! Enter friends name and food they plan to bring",
                "Party Picker", JOptionPane.INFORMATION_MESSAGE);

        // Loop through letting user add friends information until prompt to exit is received
        do {
            // Input dialogs to capture user information
            String firstName =JOptionPane.showInputDialog(null, "Enter first name", "Party Picker", 3);
            String lastName =JOptionPane.showInputDialog(null, "Enter last name", "Party Picker", 3);
            String foodToBring =JOptionPane.showInputDialog(null,
                    "What food do you expect " + firstName + " " + lastName + " will bring?",
                    "Party Picker", 3);

            // Here we need to decide based on what food they're bringing, if they are invited or not
            boolean isInvited = false; // Default choice, will change to true if invited
            Object[] buttons = {"Invited", "Not Invited"};
            int invitedResult = JOptionPane.showOptionDialog(null,
                    "Is " + firstName + " " + lastName + " invited to the party?",
                    "Party Picker", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    buttons, buttons[0]);

            // Set isInvited flag to true if the friend is invited
            if (invitedResult == 0) {
                isInvited = true;
            }

            // Take user entered values and instantiate a new friend object to add to friendList
            friendList.add(new Friend(firstName, lastName, isInvited, foodToBring));

            // Check if the user is done or wants to add another friend
        } while (JOptionPane.showConfirmDialog(null, "Would you like to add another friend?",
                "Party Picker", JOptionPane.YES_NO_OPTION) == 0);

        // Final report on friends info and invite status
        String finalReport = "Friend info\n******************************************";

        // Create a for each loop to go through friendsList, call toString method then add to final report
        for (Friend currentFriend: friendList) {
            finalReport += "\n" + currentFriend.toString();
        }

        //Print the final report in a Message dialog.
        JOptionPane.showMessageDialog(null, "\n" + finalReport, "Final Report", 1);
    }
}