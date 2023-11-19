import javax.swing.*;
import java.awt.*;

public class Practice_GUI_1 extends JFrame {
    public Practice_GUI_1() {
        setTitle("실습 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.GREEN);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("Submit"));
        contentPane.add(new JButton("Edit"));
        contentPane.add(new JButton("Delete"));

        setSize(600, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Practice_GUI_1();
    }
}