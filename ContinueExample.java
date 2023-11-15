import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        System.out.println("정수 5개 입력해라 ");
        for(int i=0;i<5;i++){
            int n = scanner. nextInt();
            if(n<=0){
                continue;
            }else{
                sum+=n;
            }
        }
            System.out.println("양수 합은"+sum);
            scanner.close();
        }
    }

