// import java.util.Arrays;
// import java.util.Scanner;

// public class OOP1101_3 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String[] userinput = scanner.nextLine().split(" ");

//         int numbercount = Integer.parseInt(userinput[0]);
//         int sumnumber = Integer.parseInt(userinput[1]);  

//         int[] array = new int[numbercount]; 
//         int avg = sumnumber / numbercount; 
//         int x = sumnumber % numbercount; 

//         for (int i = 0; i < numbercount; i++) {
//             array[i] = avg;
//         }

//         for (int i = 0; i < x; i++) {
//             array[i]++;
//         }

//         Arrays.sort(array);

//         for (int num : array) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         scanner.close();
//     }
// }






// import java.util.Scanner;

// public class OOP1101_3 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String[] input = scanner.nextLine().split(" ");

//         int number = Integer.parseInt(input[0]); 
//         int number_sum = Integer.parseInt(input[1]);  

//         int[] array = new int[number];
//         int basenumber = number_sum / number; 
//         int m = number_sum % number;

//         for (int i = 0; i < number; i++) {
//             array[i] = basenumber;
//         }
//         for (int i = number - 1; m > 0; i--, m--) {
//             array[i]++;
//         }

//         for (int i = 0; i < number; i++) {
//             System.out.print(array[i] + " ");
//         }
//         System.out.println();

//         scanner.close();
//     }
// } 










import java.util.Scanner;

public class OOP1101_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        int S = scanner.nextInt();  


        if (n > S) {
            System.out.println(-1);
            scanner.close();
            return;
        }
        int m = S % n; 
        int[] array = new int[n];


        int basenumber = S / n;  
        for (int i = 0; i < n; i++) {
            array[i] = basenumber;
        }

       
        int index = n - 1; 
        while (m > 0) {
            array[index]++; 
            index--; 
            m--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}