import javax.swing.*;

public class OOP1122_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Absolute Positioning Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(300, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("This is a JLabel");
        label.setBounds(50, 30, 150, 20); 
        frame.add(label);

        int[] positions = {140, 240, 340};
        for (int i = 0; i < positions.length; i++) {
            JButton button = new JButton(String.valueOf(i + 1));
            button.setBounds(positions[i], positions[i], 80, 30); 
            frame.add(button);
        }

        frame.setVisible(true);
    }
}
