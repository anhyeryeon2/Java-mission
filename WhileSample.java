import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int count=0;

        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
        int number = scanner.nextInt();
        while(number!=-1){
            sum+=number;
            count++;
            number = scanner.nextInt();
        }
        if(count==0){
            System.out.println("입력된게 없다.");
        
        }else{
            System.out.println("정수의 갯수는 "+ count);
            System.out.println("평균은"+sum/count );
        }


        scanner.close();

    }
}
