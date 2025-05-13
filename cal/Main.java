import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("input.txt");
        try(Scanner scan = new Scanner(file)){

            double total = 0.0;

            while(scan.hasNextDouble()){
                double num = scan.nextDouble();
                total += num;
                System.out.printf("%.2f%n", num);
            }

            System.out.println("Total: " + total);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
