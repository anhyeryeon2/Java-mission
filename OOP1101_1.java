import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOP1101_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        int userinput = Integer.parseInt(scanner.nextLine()); 

        while (names.size() < userinput) {
            String[] splitedtext = scanner.nextLine().split(" ");

            if (splitedtext[0].equals("new")) {
                names.add(splitedtext[1]);
            } else if (splitedtext[0].equals("set")) {
                int index = Integer.parseInt(splitedtext[1]);
                names.set(index, splitedtext[2]);
            }
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        scanner.close(); 
    }
}
