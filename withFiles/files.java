import java.io.*;
import java.util.*;

public class files {
    public static void main(String args[]){

        File inputFile = new File("C:\\Work\\GitHub\\Java-Practice\\withFiles\\letter.txt");
        try (Scanner sc = new Scanner(inputFile)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
