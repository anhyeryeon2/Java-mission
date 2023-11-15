// import java.util.*;

// class Result {
//     private int result = 0;
//     private int point_A = 0;
//     private int point_B = 0;

//     public void updateIndex_A(int[] A, int selectindex) {
//         point_A = A[selectindex];
//     }

//     public void updateIndex_B(int[] B) {
//         int selectindex = -1;
//         int gap = Integer.MAX_VALUE;
        
//         for (int i = 0; i < B.length; i++) {
//             if (B[i] > point_A && B[i] - point_A < gap) {
//                 selectindex = i;
//                 gap = B[i] - point_A;
//             }
//         }
        
//         if (selectindex == -1) {
//             for (int i = 0; i < B.length; i++) {
//                 if (B[i] != -1) {
//                     selectindex = i;
//                     break;
//                 }
//             }
//         }
        
//         point_B = B[selectindex];
//         B[selectindex] = -1;
//     }

//     public void updateResult() {
//         if (point_A < point_B) {
//             result++;
//         }
//     }

//     public int getPoint_A() {
//         return point_A;
//     }

//     public int getPoint_B() {
//         return point_B;
//     }

//     public int getResult() {
//         return result;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] arrayAinput = sc.nextLine().split(" ");
//         String[] arrayBinput = sc.nextLine().split(" ");

//         int[] A = new int[arrayAinput.length];
//         int[] B = new int[arrayBinput.length];

//         for (int i = 0; i < arrayAinput.length; i++) {
//             A[i] = Integer.parseInt(arrayAinput[i]);
//             B[i] = Integer.parseInt(arrayBinput[i]);
//         }

//         Result res = new Result();

//         for (int i = 0; i < A.length; i++) {
//             result.updateIndex_A(A, i);
//             result.updateIndex_B(B);
//             result.updateResult();
//         }
//         sc.close(); 
//         System.out.println(result.getResult());
        
//     }
    
// }


import java.util.*;

class Result {
    private int result = 0;
    private int point_A = 0;
    private int point_B = 0;
    private int[] A;
    private int[] B;
    private int currentindex = 0;

    public Result(int[] A, int[] B) {
        this.A = A;
        this.B = B;
    }

    public void updateIndex_A() {
        point_A = A[currentindex];
        currentindex++; 
    }

    public void updateIndex_B() {
        int selectindex = -1;
        int gap = Integer.MAX_VALUE;
        
        for (int i = 0; i < B.length; i++) {
            if (B[i] > point_A && B[i] - point_A < gap) {
                selectindex = i;
                gap = B[i] - point_A;
            }
        }
        
        if (selectindex == -1) {
            for (int i = 0; i < B.length; i++) {
                if (B[i] != -1) {
                    selectindex = i;
                    break;
                }
            }
        }
        
        point_B = B[selectindex];
        B[selectindex] = -1;
    }

    public void updateResult() {
        if (point_A < point_B) {
            result++;
        }
    }

    public int getPoint_A() {
        return point_A;
    }

    public int getPoint_B() {
        return point_B;
    }

    public int getResult() {
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputAString = sc.nextLine().split(" ");
        String[] inputBString = sc.nextLine().split(" ");

        int[] A = new int[inputAString.length];
        int[] B = new int[inputBString.length];

        for (int i = 0; i < inputAString.length; i++) {
            A[i] = Integer.parseInt(inputAString[i]);
            B[i] = Integer.parseInt(inputBString[i]);
        }

        Result result = new Result(A, B);

        for (int i = 0; i < A.length; i++) {
            result.updateIndex_A();
            result.updateIndex_B();
            result.updateResult(); 
        }
        sc.close(); 
        System.out.println(result.getResult());
    }
}
