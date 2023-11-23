import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class PrimeNumberFinder implements Runnable {
    private int start, end;
    private List<Integer> primes;

    public PrimeNumberFinder(int start, int end, List<Integer> primes) {
        this.start = start;
        this.end = end;
        this.primes = primes;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                synchronized (primes) {
                    primes.add(i);
                }
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> primes = Collections.synchronizedList(new ArrayList<>());
        int threadCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        int chunkSize = n / threadCount;

        for (int i = 0; i < threadCount; i++) {
            int start = i * chunkSize + 1;
            int end = (i == threadCount - 1) ? n : start + chunkSize - 1;
            executor.execute(new PrimeNumberFinder(start, end, primes));
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

        Collections.sort(primes);
        primes.forEach(prime -> System.out.print(prime + " "));
    }
}
