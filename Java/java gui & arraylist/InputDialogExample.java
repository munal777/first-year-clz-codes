import javax.swing.JOptionPane;

public class InputDialogExample {
    public static void main(String[] args) {
        // Display a dialog box asking the user for a number
        String input = JOptionPane.showInputDialog("Enter a number:");

        try {
            // Convert the input to an int
            int number = Integer.parseInt(input);

            // Display the number in another dialog box
            JOptionPane.showMessageDialog(null, "You entered: " + number);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid integer.");
        }
    }
}
