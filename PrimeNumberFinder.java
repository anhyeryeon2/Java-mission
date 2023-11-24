import java.util.*;

public class PrimeNumberFinder implements Runnable {
    public int start, end;
    public List<Integer> numberlist;
    

    public PrimeNumberFinder(int start, int end) {
        this.start = start;
        this.end = end;
        this.numberlist = new ArrayList<>(); 
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                numberlist.add(i); 
            }
        }
    }
    public List<Integer> getnumberlist() {
        return numberlist; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int threadCount = Runtime.getRuntime().availableProcessors();
        PrimeNumberFinder[] p = new PrimeNumberFinder[threadCount];
        Thread[] threads = new Thread[threadCount];

        int size = n / threadCount;
        for (int i = 0; i < threadCount; i++) {
            int start = i * size + 1;
            int end;
            if (i == threadCount - 1) {
                end = n;
            } else {
                end = start + size - 1;
            }

            PrimeNumberFinder primefinder = new PrimeNumberFinder(start, end);
            p[i] = primefinder;
            Thread threadForPrimeFinder = new Thread(primefinder);
            threads[i] = threadForPrimeFinder;
            threadForPrimeFinder.start();
        }

        List<Integer> allnumber = new ArrayList<>();
        try {
            for (int i = 0; i < threadCount; i++) {
                threads[i].join();
                allnumber.addAll(p[i].getnumberlist()); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Collections.sort(allnumber); 
        for (Integer prime : allnumber) {
            System.out.print(prime + " ");
        }
        scanner.close();
    }
}
