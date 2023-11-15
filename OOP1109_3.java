// import java.io.IOException;
// import java.util.LinkedList;
// import java.util.Scanner;

// public class OOP1109_3 {
//     public static void main(String[] args) throws IOException {
//         LinkedList<Integer> list = new LinkedList<>();
//         Scanner scanner = new Scanner(System.in);

//         int number;
//         do {
//             number = scanner.nextInt();
//             if (number == -1) {
//                 break;
//             }
//             if (number <= 0) {
//                 System.out.println("0보다 큰 숫자를 입력하세요.");
//                 continue;
//             }
//             if (number >= 1000000) {
//                 System.out.println("1000000보다 작은 숫자를 입력하세요.");
//                 continue;
//             }
//             list.add(number);
//         } while (number != -1);
        
//         System.out.print("Reversed list: [");
//         for (int i = list.size() - 1; i >= 0; i--) {
//             System.out.print(list.get(i));
//             if (i > 0) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.println("]");
        
//         scanner.close();
//     }
// }
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class OOP1109_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number <= 0) {
                System.out.println("0보다 큰 숫자를 입력하세요.");
                continue;
            }
            if (number >= 1000000) {
                System.out.println("1000000보다 작은 숫자를 입력하세요.");
                continue;
            }
            list.add(number);
        }

        Collections.reverse(list);
        System.out.print("Reversed list: [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
