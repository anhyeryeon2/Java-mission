import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class OOP1122_3 implements Runnable {
    private int start, end;
    private static final List<Integer> primes = Collections.synchronizedList(new ArrayList<>());

    public OOP1122_3(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 : ");
        int n = Integer.parseInt(reader.readLine());

        int threadCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        int chunkSize = n / threadCount + 1;
        for (int i = 0; i < threadCount; i++) {
            int start = i * chunkSize + 1;
            int end = Math.min((i + 1) * chunkSize, n);
            executor.submit(new OOP1122_3(start, end));
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        Collections.sort(primes);
        System.out.print("출력 : ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
