// import java.util.*;

// public class OOP1109_1 {
//     public static class MyStack<E> extends Vector<E> {
//         public void push(E item) {
//             addElement(item);
//         }

//         public E pop() {
//             if (isEmpty()) {
//                 return null;
//             }
//             return remove(size() - 1);
//         }

//         public E peek() {
//             if (isEmpty()) {
//                 return null;
//             }
//             return elementAt(size() - 1);
//         }

//         public boolean isEmpty() {
//             return size() == 0;
//         }

//         public int search(Object o) {
//             int index = lastIndexOf(o);
//             if (index >= 0) {
//                 return size() - index; 
//             } else {
//                 return -1;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         MyStack<String> stack = new MyStack<>();
//         Scanner scanner = new Scanner(System.in);

//         int count = Integer.parseInt(scanner.nextLine().trim());
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < count; i++) {
//             String text = scanner.nextLine();

//             if (text.startsWith("push ")) {
//                 String str = text.substring(5).trim();
//                 stack.push(str);
//             } else if ("pop".equals(text)) {
//                 String popped = stack.pop();
//                 if (popped == null) {
//                     result.append("Stack is empty.\n");
//                 }
//             }
//         }

//         String lastone = stack.peek();
//         result.append(lastone == null ? "Stack is empty.\n" : "Peek: " + lastone + "\n");
//         result.append("Is Stack empty? ").append(stack.isEmpty() ? "Yes\n" : "No\n");

//         int indexThree = stack.search("3");
//         result.append("Position of 3: ");
//         result.append(indexThree > 0 ? indexThree : "-1");
//         System.out.print("\n" + result.toString());
//         scanner.close();
//     }
// }
import java.io.*;
import java.util.*;

public class OOP1109_1 {
    public static class MyStack<E> extends Vector<E> {
        public E push(E item) {
            add(item);
            return item;
        }

        public E pop() {
            if (size() == 0) {
                System.out.println("Stack is empty.");
                return null;
            }
            return remove(size() - 1);
        }

        public E peek() {
            if (size() == 0) {
                System.out.println("Stack is empty.");
                return null;
            }
            return elementAt(size() - 1);
        }

        public int search(Object o) {
            for (int i = 0; i < size(); i++) {
                if (elementAt(i).equals(o)) {
                    return i + 1; 
                }
            }
            return -1; 
        }
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < count; i++) {
            String text = scanner.nextLine();

            if (text.startsWith("push")) {
                String str = text.substring(5).trim();
                stack.push(str);
            }
            if (text.startsWith("pop")) {
                stack.pop();
            }
        }

        if (stack.size() == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Peek: " + stack.peek());
        }

        System.out.println("Is Stack empty? " + (stack.size() == 0 ? "true" : "false"));

        int indexThree = stack.search("3");
        System.out.println("Position of 3: " + indexThree);
    
        scanner.close();
    }
}
