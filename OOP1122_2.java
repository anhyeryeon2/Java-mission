import javax.swing.*;

public class OOP1122_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Absolute Positioning Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(300, 300);
        frame.setLayout(null); // 레이아웃 매니저를 null로 설정하여 절대 위치 사용

        // 레이블 생성 및 배치
        JLabel label = new JLabel("This is a JLabel");
        label.setBounds(50, 30, 150, 20); // 위치 (50,30)에 크기 (150,20)로 설정
        frame.add(label);

        // 버튼 생성 및 배치
        int[] positions = {140, 240, 340};
        for (int i = 0; i < positions.length; i++) {
            JButton button = new JButton(String.valueOf(i + 1));
            button.setBounds(positions[i], positions[i], 80, 30); // 위치 (140,140), (240,240), (340,340)에 크기 (80,30)로 설정
            frame.add(button);
        }

        // 프레임을 보이게 설정
        frame.setVisible(true);
    }
}
