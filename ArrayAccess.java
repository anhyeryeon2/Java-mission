import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[]=new int[5];
        int max=0;
        System.out.println("양수 5개를 입력하세요");
        for(int i=0;i<5;i++){
            array[i]=scanner.nextInt();   //입력받은 정수를 배열에 저장 
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("가장 큰수는"+max);
        scanner.close();
    }
}
