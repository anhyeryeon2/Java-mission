import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OOP1109_2 {
    public static void main(String[] args) {
        String f = "data/lab10.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(f));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing" + e.getMessage());
                }
            }
        }
    }
}