import java.util.Scanner;

public class OOP1101_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        StringBuffer reversedtext = new StringBuffer(text).reverse();
        if (text.equals(reversedtext.toString())) {
            System.out.println(text + " 은/는 회문입니다.");
        } else {
            System.out.println(text + " 은/는 회문이 아닙니다.");
        }
        scanner.close();
    }
}
