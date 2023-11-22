import javax.swing.*;
import java.awt.*;

public class OOP1122_1 {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c= frame.getContentPane();
        
        c.setLayout(new BorderLayout(40, 20));
        c.add(new JButton("calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("div"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("sub"), BorderLayout.WEST);
        
        frame.setSize(400, 600);
        frame.setVisible(true);
    }
}
