import javax.swing.*;
import java.awt.*;
public class Practice_GUI_2 extends JFrame {
    public Practice_GUI_2() {
        setTitle("실습 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
        c.add(new JButton("Button1"));
        c.add(new JButton("Button2"));
        c.add(new JButton("Button3"));
        c.add(new JButton("Button4"));
        c.add(new JButton("Button5"));

        setSize(500, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Practice_GUI_2();
    }
}