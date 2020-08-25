package atm;
 
import javax.swing.*;

// If the result would be negative
public class InsufficientFunds extends Exception {
    public InsufficientFunds() {
        JOptionPane frame = new JOptionPane();
        JOptionPane.showMessageDialog(frame, "Insufficient Funds.");
    }
}

